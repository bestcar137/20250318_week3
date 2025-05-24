package CH_code.ch12;

import javax.swing.*;
import java.awt.*;

/** paintJPanelEx를 prac12_1로 대체 */
public class prac12_1 extends JFrame {
    private MyPanel panel = new MyPanel();

    public prac12_1() {
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setSize(250, 220);
        setVisible(true);
    }

    class MyPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawRect(10, 10, 50, 50);
            g.drawRect(50, 50, 50, 50);

            g.setColor(Color.MAGENTA);
            g.drawRect(90, 90, 50, 50);
        }
    }

    public static void main(String[] args) {
        new prac12_1();
    }
}