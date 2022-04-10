import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 extends JFrame {
    int count = 0;

    Swing2(){
        JTextField tf1 = new JTextField("");
        tf1.setBounds(200, 200, 150, 30);

        JButton btn1 = new JButton("확인");
        btn1.setBounds(370, 200, 100, 30);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("클릭 횟수 : " + (++count));
            }
        });

        add(tf1); add(btn1);
        setTitle("클릭 횟수 이벤트");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing2();
    }
}
