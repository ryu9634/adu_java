import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("액션 이벤트");
        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(1, 1));

        JButton bt = new JButton("확인");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                if(btn.getText().equals("안녕")){
                    btn.setText("반가워");
                }else{
                    btn.setText("안녕");
                }
            }
        });
        pn.add(bt);
        fr.setContentPane(pn);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}
