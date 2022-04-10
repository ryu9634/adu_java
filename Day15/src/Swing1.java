import javax.swing.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame();

        JButton btn1 = new JButton("클릭하세요!");
        btn1.setBounds(100, 100, 100, 40);

        jf1.add(btn1);
        jf1.setSize(400, 400); // width, height
        jf1.setLayout(null); // 레이아웃을 잡지 않음
        jf1.setVisible(true);
    }
}
