package CH_code.ch12;

import javax.swing.*;
import java.awt.*;

/** GraphicsDrawStringEx를 prac12_2로 대체 */
public class prac12_2 extends JFrame {
    private MyPanel panel = new MyPanel();

    public prac12_2() {
        setTitle("drawString 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setSize(250, 200);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawString("자바는 재밌다.~~", 30, 30);
            g.drawString("얼마나? 하늘만큼 땅만큼 !!!!", 60, 60);
        }
    }

    public static void main(String[] args) {
        new prac12_2();
    }
}