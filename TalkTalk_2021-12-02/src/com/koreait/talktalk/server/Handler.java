package com.koreait.talktalk.server;

import com.koreait.talktalk.model.Message;
import com.koreait.talktalk.model.TypeOfMessage;
import com.koreait.talktalk.model.User;
import com.koreait.talktalk.server.exception.DuplicateUsernameException;
import com.koreait.talktalk.server.util.UserList;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Handler implements Runnable {

    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    User user;
    String name;
    Message message;

    public Handler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            addUser();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (DuplicateUsernameException e) {
            name = null;
            e.printStackTrace();
        }
    }

    private void addUser() throws IOException, ClassNotFoundException, DuplicateUsernameException {
        ois = new ObjectInputStream(socket.getInputStream());
        oos = new ObjectOutputStream(socket.getOutputStream());
        Message userName = (Message) ois.readObject();
        user = new User(userName.getName(), Integer.parseInt(userName.getMessage()), oos);
        if(UserList.addList(user)){
            name = userName.getName();
            sendWelcomeMessage();
        }else{
            sendDuplicateError();
            throw new DuplicateUsernameException("이미 사용중인 닉네임입니다!");
        }
    }

    private void sendWelcomeMessage() throws IOException {
        String adminMessage = name + " 님이 입장하셨습니다";
        setAdminMessage(TypeOfMessage.WELCOME, adminMessage);
        sendMessage();

    }

    private void setAdminMessage(TypeOfMessage type, String adminMessage){
        String adminName = "관리자";
        message = new Message();
        message.setName(adminName);
        message.setType(type);
        message.setMessage(adminMessage);
        message.setUserList(UserList.getList());
    }

    private void sendDuplicateError() throws IOException {
        setAdminMessage(TypeOfMessage.DUPLICATE, null);
        sendMessageToOne(oos);
    }

    private void sendMessageToOne(ObjectOutputStream oosToOne) throws IOException{
        oosToOne.writeObject(message);
        oosToOne.reset();
    }

    private void sendMessage() throws IOException{
        for(User user : UserList.getList()){
            sendMessageToOne(user.getOos());
        }
    }
}
