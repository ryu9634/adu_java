import javax.swing.*;
import java.awt.*;

public class FlowLayout1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("플로우 레이아웃");
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[10];

        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.LEFT);
        pn.setLayout(fl);

        for(int i=0; i<bt.length; i++){
            bt[i] = new JButton("버튼" + i);
            pn.add(bt[i]);
        }

        fr.setContentPane(pn);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}
