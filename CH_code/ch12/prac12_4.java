package CH_code.ch12;

import javax.swing.*;
import java.awt.*;

/** GraphicsDrawLineEx를 prac12_4로 대체 */
public class prac12_4 extends JFrame {
    private MyPanel panel = new MyPanel();

    public prac12_4() {
        setTitle("drawLine 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(200, 170);
        setVisible(true);
    }

    class MyPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.RED); // 빨간색 선택
            g.drawLine(20, 20, 100, 100); // 선그리기
        }
    }

    public static void main(String[] args) {
        new prac12_4();
    }
}