import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public Login(){
        setTitle("로그인");
        setSize(300, 200);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));
        panel1.add(new JLabel("아이디"));
        panel1.add(new JTextField());
        panel1.add(new JLabel("비밀번호"));
        panel1.add(new JTextField());

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 2));
        panel2.add(new JButton("로그인"));
        panel2.add(new JButton("회원가입"));

        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
