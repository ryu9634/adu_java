import javax.swing.*;
import java.awt.*;

public class GridLayout1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("그리드 레이아웃");
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[4];

        GridLayout gl = new GridLayout(2, 2);
        pn.setLayout(gl);

        for(int i=0; i<bt.length; i++){
            bt[i] = new JButton("버튼" + i);
            pn.add(bt[i]);
        }

        pn.add(bt[3]);
        pn.add(bt[2]);
        pn.add(bt[1]);
        pn.add(bt[0]);

        fr.setContentPane(pn);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}
