import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseEvent1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("마우스 이벤트");
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[4];

        GridLayout gl = new GridLayout(2, 2);
        pn.setLayout(gl);

        for(int i=0; i<bt.length; i++){
            bt[i] = new JButton("버튼" + i);
            if(i % 2 == 0){
                bt[i].addMouseListener(new MyMouseListener(i));
            }else{
                bt[i].addMouseMotionListener(new MyMouseListener(i));
            }
            pn.add(bt[i]);
        }

        pn.add(bt[0]);
        pn.add(bt[1]);
        pn.add(bt[2]);
        pn.add(bt[3]);

        fr.setContentPane(pn);

        fr.setSize(500, 500);
        fr.setVisible(true);

    }
}

class MyMouseListener implements MouseInputListener {

    private int btnNumber;

    public MyMouseListener(int btnNumber){
        this.btnNumber = btnNumber;
    }

    // 클릭했을 때
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("클릭 이벤트!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }

    // 눌렀을 때
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("Pressed!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }

    // 땟을 때
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("Released!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }

    // 특정 컴포넌트에 마우스가 들어가는 순간
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("mouseEntered!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }

    // 특정 컴포넌트에 마우스가 나가는 순간
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("mouseExited!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }

    // 특정 컴포넌트 내에서 드레그 하는 동안 내내
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("mouseDragged!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }

    // 특정 컴포넌트 내에서 마우스가 움직이는 내내
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println(e.getSource().getClass().getName() + btnNumber);
        System.out.println("mouseMoved!");
        System.out.println("클릭 수 : " + e.getClickCount());
        System.out.println("클릭 좌표 : " + e.getPoint().toString());
    }
}