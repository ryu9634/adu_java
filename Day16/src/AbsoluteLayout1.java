import javax.swing.*;

public class AbsoluteLayout1 {

    private final static int BUTTON_SIZE = 5;

    public static void main(String[] args) {
        JFrame fr = new JFrame("앱솔루트 레이아웃");
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[BUTTON_SIZE];
        int[] width = {100, 150, 200, 250, 300};
        int[] height = {50, 150, 200, 250, 300};
        pn.setLayout(null);

        for(int i=0; i<BUTTON_SIZE; i++){
            bt[i] = new JButton("버튼" + i);
            bt[i].setBounds(100, 50, width[i], height[i]);
            pn.add(bt[i]);
        }

        fr.setContentPane(pn);
        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}
