import javax.swing.*;

public class Component1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("프레임");
        JPanel pn = new JPanel();
//        JLabel lb = new JLabel("라벨");
//        pn.add(lb);

//        JTextField tf = new JTextField("텍스트필드");
//        pn.add(tf);

        // 콤보박스
//        JComboBox<String> cb = new JComboBox<>();
//        cb.addItem("김사과");
//        cb.addItem("반하나");
//        cb.addItem("오렌지");
//        pn.add(cb);

//        JButton bt = new JButton("버튼");
//        pn.add(bt);

//        JCheckBox cb = new JCheckBox("체크박스");
//        pn.add(cb);

        JRadioButton male = new JRadioButton("남자");
        JRadioButton female = new JRadioButton("여자");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        pn.add(male);
        pn.add(female);

        fr.setContentPane(pn);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
}
