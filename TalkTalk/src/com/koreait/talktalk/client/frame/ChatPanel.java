package com.koreait.talktalk.client.frame;

import com.koreait.talktalk.client.Sender;
import com.koreait.talktalk.client.util.HTMLMaker;
import com.koreait.talktalk.client.util.UserList;
import com.koreait.talktalk.model.ChatCommand;
import com.koreait.talktalk.model.Message;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.awt.event.*;

public class ChatPanel extends JPanel {

    JScrollPane chatScrollPane;
    JTextPane chatTextPane;
    JList userList;
    DefaultListModel<String> userListModel = new DefaultListModel<String>();
    private boolean isOpenList = false;
    HTMLDocument doc;
    JTextArea txtrMessage;
    private StringBuffer messageList = new StringBuffer();
    private StringBuffer chatLog = new StringBuffer();
    private HTMLMaker htmlMaker = new HTMLMaker();


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

        userList = new JList(userListModel);
        userList.setBackground(Color.WHITE);
        userList.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        userList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(isDoubleClicked(e)){
                    setWhisperCommand(userList.getSelectedValue().toString());
                }
            }
        });

        chatScrollPane.setColumnHeaderView(userList);
        userList.setVisible(false);
        userList.setVisibleRowCount(0);
        userList.setAutoscrolls(true);

        JLabel lblUserList = new JLabel("≡");
        lblUserList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                userListContol();
            }
        });
        lblUserList.setFont(new Font("맑은 고딕", Font.BOLD, 35));
        lblUserList.setHorizontalAlignment(SwingConstants.CENTER);
        lblUserList.setBounds(0, 0, 40, 40);
        chatBoardPane.add(lblUserList);

        chatTextPane.setContentType("text/html");
        doc = (HTMLDocument) chatTextPane.getStyledDocument();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 450, 220, 70);
        add(scrollPane);

        txtrMessage = new JTextArea();
        txtrMessage.setLineWrap(true);
        txtrMessage.setWrapStyleWord(true);
        txtrMessage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(isEnter(e)) {
                    pressEnter(txtrMessage.getText().replaceAll("\n", ""));
                }
            }
        });
        scrollPane.setViewportView(txtrMessage);

        JButton btnNewButton = new JButton("확인");
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
        btnNewButton.setBackground(Color.GRAY);
        btnNewButton.setBounds(220, 450, 65, 68);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressEnter(txtrMessage.getText());
            }
        });
        add(btnNewButton);

    }

    private void userListContol(){
        if(isOpenList){
            userListClose();
        }else{
            userListOpen();
        }
    }

    private void userListClose(){
        userList.setVisible(false);
        userList.setVisibleRowCount(0);
        isOpenList = false;
    }

    private void userListOpen(){
        setUserList();
        userList.setVisible(true);
        userList.setVisibleRowCount(8);
        isOpenList = true;
    }

    private void setUserList(){
        userListModel.clear();
        for(String userName : UserList.getUsernameList()){
            userListModel.addElement(userName);
        }
    }

    private boolean isDoubleClicked(MouseEvent e){
        return e.getClickCount() == 2;
    }

    private void setWhisperCommand(String whisperTarget){
        txtrMessage.setText(ChatCommand.WHISPER+" "+whisperTarget+" ");
    }

    private boolean isEnter(KeyEvent e){
        return e.getKeyCode() == KeyEvent.VK_ENTER;
    }

    private void pressEnter(String userMessage){
        if(isNullString(userMessage)){
            return;
        }else if(isWhisper(userMessage)){
            sendWhisper(userMessage);
        }else{
            sendMessage(userMessage);
        }
        txtrMessage.setText("");
        txtrMessage.setCaretPosition(0);
    }

    private boolean isNullString(String userMessage){
        return userMessage == null || userMessage.equals("");
    }

    private boolean isWhisper(String text){
        return text.startsWith(ChatCommand.WHISPER.toString());
    }

    private void sendMessage(String userMessage){
        Sender.getSender().sendMessage(userMessage);
    }

    private void sendWhisper(String userMessage){
        String whisperTarget = userMessage.split(" ", 3)[1];
        String sendingMessage =
                userMessage.replaceAll(ChatCommand.WHISPER+" "+whisperTarget, "");
        Sender.getSender().sendWhisper(sendingMessage, whisperTarget);
    }

    public void addMessage(String adminMessage){
        messageList.append(htmlMaker.getHTML(adminMessage));
        rewriteChatPane();
        addChatLog(adminMessage);
    }

    public void addMessage(boolean isMine, Message message){
        messageList.append(htmlMaker.getHTML(isMine, message));
        rewriteChatPane();
        addChatLog(message.getName(), message.getMessage());
    }

    private void rewriteChatPane(){
        chatTextPane.setText(messageList.toString());
        chatTextPane.setCaretPosition(doc.getLength());
    }

    private void addChatLog(String adminMessage) {
        chatLog.append(adminMessage + "\r\n");
    }

    private void addChatLog(String userName, String userMessage){
        chatLog.append(userName + " : " + userMessage + "\r\n");
    }
}
