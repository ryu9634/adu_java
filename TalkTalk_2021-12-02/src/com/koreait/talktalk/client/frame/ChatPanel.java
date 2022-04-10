package com.koreait.talktalk.client.frame;

import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {

    JScrollPane chatScrollPane;
    JTextPane chatTextPane;

    public ChatPanel(){
        setLayout(null);

        JPanel chatBoardPane = new JPanel();
        chatBoardPane.setBackground(Color.PINK);
        chatBoardPane.setBounds(0, 0, 300, 450);
        add(chatBoardPane);
        chatBoardPane.setLayout(null);

        chatScrollPane = new JScrollPane();
        chatScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        chatScrollPane.setBounds(0, 50, 300, 400);
        chatBoardPane.add(chatScrollPane);

        chatTextPane = new JTextPane();
        chatTextPane.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        chatTextPane.setBackground(Color.PINK);
        chatScrollPane.setViewportView(chatTextPane);
        chatTextPane.setText("");

    }
}
