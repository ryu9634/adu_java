package com.koreait.talktalk.client;

import com.koreait.talktalk.model.Message;
import com.koreait.talktalk.model.TypeOfMessage;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

    private static Sender sender;
    String name;
    ObjectOutputStream oos;

    public Sender(ObjectOutputStream oos, String name){
        this.name = name;
        this.oos = oos;
        sender = this;
    }

    public static Sender getSender(){
        return sender;
    }

    public void sendMessage(String userMessage){
        Message message = getMessage(userMessage);
        message.setType(TypeOfMessage.MESSAGE);
        send(message);

    }

    public Message getMessage(String userMessage){
        Message message = new Message();
        message.setName(name);
        message.setMessage(userMessage);
        return message;
    }

    public void send(Message message){
        try {
            oos.writeObject(message);
            oos.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendWhisper(String userMessage, String whisperTarget){
        Message message = getMessage(userMessage);
        message.setType(TypeOfMessage.WHISPER);
        message.setWhisperTarget(whisperTarget);
        send(message);
    }
}
