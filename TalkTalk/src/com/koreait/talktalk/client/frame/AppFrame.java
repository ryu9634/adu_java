package com.koreait.talktalk.client.frame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AppFrame extends JFrame {

    private JPanel contentPane;
    private LoginPanel loginPane;
    private ChatPanel chatPane;

    public AppFrame(){
        setTitle("TalkTalk");
        loginPane = new LoginPanel(this);
        chatPane = new ChatPanel();

        setBounds(100, 100, 300, 600);
        changeToLogin();
    }

    public void changeToLogin(){
        contentPane = loginPane;
        paintPane();
    }

    public void paintPane(){
        contentPane.setBorder(new EmptyBorder(0,0,0,0));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        revalidate();
        repaint();
    }

    public LoginPanel getLoginPane() {
        return loginPane;
    }

    public ChatPanel getChatPane() {
        return chatPane;
    }

    public void changeToError(String errorMessage){
        contentPane = new ErrorPanel(this, errorMessage);
        paintPane();
    }

    public void changeToChat(){
        contentPane = chatPane;
        paintPane();
    }
}
