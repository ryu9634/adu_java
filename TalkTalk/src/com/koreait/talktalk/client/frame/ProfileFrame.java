package com.koreait.talktalk.client.frame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class ProfileFrame extends JFrame {
    public static final String PROFILEPATH = "profile";
    private JPanel contentPane;
    JPanel panel;

    public ProfileFrame(AppFrame frame){
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        setBounds(100, 100, 400, 300);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 0, 380, 230);
        contentPane.add(scrollPane);

        panel = new JPanel();
        panel.setBackground(Color.PINK);
        scrollPane.setViewportView(panel);

        File path = new File(PROFILEPATH);
        int numberOfProfile = path.list().length;
        int rowLength = numberOfProfile%2 == 0 ? numberOfProfile/2 : numberOfProfile/2+1;
        panel.setLayout(new GridLayout(rowLength, 2, 0, 12));

        JLabel[] lblProfile = new JLabel[numberOfProfile];

        for(int i=0; i<numberOfProfile; i++){
            lblProfile[i] = new JLabel(getProfileImage(i));
            lblProfile[i].setForeground(Color.WHITE);
            lblProfile[i].setText(""+i);
            lblProfile[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JLabel profile = (JLabel) e.getSource();
                    frame.getLoginPane().changeProfileImage(Integer.parseInt(profile.getText()));
                    dispose();
                }
            });

            panel.add(lblProfile[i]);
        }
    }

    private ImageIcon getProfileImage(int index){
        return new ImageIcon(new ImageIcon(PROFILEPATH + "/hero" + index + ".png")
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
    }
}
