package com.koreait.talktalk.client.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorPanel extends JPanel {
    public ErrorPanel(AppFrame frame, String errorMessage){
        setBackground(Color.BLUE);
        setLayout(null);

        JTextPane textPane = new JTextPane();
        textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textPane.setBackground(Color.WHITE);
        textPane.setBounds(10, 160, 265, 100);
        add(textPane);
        textPane.setText(errorMessage);

        JButton btnNewButton = new JButton("돌아가기");
        btnNewButton.setBackground(Color.GRAY);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(100, 300, 100, 30);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.changeToLogin();
            }
        });
        add(btnNewButton);
    }
}
