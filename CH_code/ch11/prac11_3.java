package CH_code.ch11;

import javax.swing.*;
import java.awt.*;

/** ButtonEx를 prac11_3으로 대체 */
public class prac11_3 extends JFrame {

    public prac11_3() {
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");

        JButton btn = new JButton("call~~", normalIcon);

        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);

        c.add(btn);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac11_3();
    }
}