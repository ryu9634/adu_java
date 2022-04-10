import javax.swing.*;
import java.awt.*;

public class BorderLayout1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("보더레이아웃");
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[5];

        BorderLayout bl = new BorderLayout();
        pn.setLayout(bl);

        for(int i=0; i<bt.length; i++){
            bt[i] = new JButton("버튼" + i);
            pn.add(bt[i]);
        }

        pn.add(bt[0], BorderLayout.NORTH);
        pn.add(bt[1], BorderLayout.EAST);
        pn.add(bt[2], BorderLayout.CENTER);
        pn.add(bt[3], BorderLayout.WEST);
        pn.add(bt[4], BorderLayout.SOUTH);

        fr.setContentPane(pn);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}
