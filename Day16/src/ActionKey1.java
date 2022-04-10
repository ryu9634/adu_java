import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ActionKey1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("액션 키이벤트");
        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(2, 1));

        JLabel lb = new JLabel("타입 : ");
        JTextField tf = new JTextField();
        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE){
                    if(!lb.getText().equals("타입 : ")){
                        lb.setText(lb.getText().substring(0, lb.getText().length() - 1));
                    }
                }else{
                    lb.setText(lb.getText() + e.getKeyChar());
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        pn.add(lb);
        pn.add(tf);
        fr.setContentPane(pn);

        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}
