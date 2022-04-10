package com.koreait.talktalk.client;

import com.koreait.talktalk.client.frame.AppFrame;
import com.koreait.talktalk.client.frame.ChatPanel;
import com.koreait.talktalk.client.util.UserList;
import com.koreait.talktalk.model.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Listener implements Runnable {

    Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    String name;
    ChatPanel chatPanel;
    Message message;
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 9999;


    AppFrame frame;

    public Listener(AppFrame frame){
        this.frame = frame;
    }

    @Override
    public void run() {
        try{
            socket = new Socket(HOST, PORT);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            name = frame.getLoginPane().getTxtName();
            chatPanel = frame.getChatPane();
            login();
            if(isLogined()){
                receive();
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            closeConnection();
        }
    }

    private void login() throws IOException{
        message = new Message();
        message.setName(name);
        message.setMessage(""+frame.getLoginPane().getProfileNum());
        System.out.println(""+frame.getLoginPane().getProfileNum());
        oos.writeObject(message);
        oos.reset();
    }

    private boolean isLogined() throws ClassNotFoundException, IOException {
        message = (Message) ois.readObject();
        System.out.println(message.getType());
        switch (message.getType()){
            case DUPLICATE:
                duplicateName();
                return false;
            case WELCOME:
                UserList.setList(message.getUserList());
            default:
                frame.changeToChat();
                new Sender(oos, name);
                printMessage(message.getMessage());
                return true;
        }
    }

    private void duplicateName() {
        frame.changeToError("이미 존재하는 닉네임입니다. 다른 이름을 선택하세요.");
    }

    private void receive() throws IOException, ClassNotFoundException {
        while(socket.isConnected()){
            message = (Message) ois.readObject();
            switch (message.getType()){
                case DUPLICATE:
                    duplicateName();
                    return;
                case WELCOME:
                case EXIT:
                    UserList.setList(message.getUserList());
                    printMessage(message.getMessage());
                    break;
                default:
                    printMessage();
                    break;
            }
        }
    }

    private void printMessage(String adminMsg){
        chatPanel.addMessage(adminMsg);
    }

    private void printMessage(){
        chatPanel.addMessage(isMine(), message);
    }

    private boolean isMine(){
        return name.equals(message.getName());
    }

    private void closeConnection(){
        if(ois != null){
            try {
                ois.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if(oos != null){
            try{
                oos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if(socket != null){
            try{
                socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
