package com.koreait.talktalk.client.frame;

import com.koreait.talktalk.client.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPanel extends JPanel {

    private JTextField txtName;
    JLabel lblProfile;
    private int profileNum = 9;
    ImageIcon profileImage = getProfileImage();


    public LoginPanel(AppFrame frame){
        setBackground(Color.PINK);
        setLayout(null);

        JLabel lblTitle = new JLabel("TalkTalk");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 35));
        lblTitle.setBounds(15, 100, 260, 50);
        add(lblTitle);

        txtName = new JTextField();
        txtName.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
        txtName.setHorizontalAlignment(SwingConstants.CENTER);
        txtName.setBounds(75, 350, 140, 30);
        add(txtName);
        txtName.setColumns(10);

        JButton btnLogin = new JButton("로그인");
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(Color.GRAY);
        btnLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
        btnLogin.setBounds(75, 400, 140, 30);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtName.getText() != null && !txtName.getText().equals("")){
                    new Thread(new Listener(frame)).start();
                }
            }
        });

        add(btnLogin);

        lblProfile = new JLabel(profileImage);
        lblProfile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProfileFrame profileFrame = new ProfileFrame(frame);
                profileFrame.setVisible(true);
            }
        });
        lblProfile.setBounds(70, 180, 160, 160);
        add(lblProfile);
    }

    private ImageIcon getProfileImage() {
        return new ImageIcon(new ImageIcon(ProfileFrame.PROFILEPATH +
                "/hero" + profileNum + ".png").getImage()
                .getScaledInstance(160, 160, Image.SCALE_SMOOTH));
    }

    public void changeProfileImage(int index){
        profileNum = index;
        profileImage = getProfileImage();
        lblProfile.setIcon(profileImage);
    }

    public String getTxtName() {
        return txtName.getText();
    }

    public int getProfileNum() {
        return profileNum;
    }
}
