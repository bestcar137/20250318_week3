package CH_code.ch12;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/** GraphicsDrawLineMouseEx를 prac12_10으로 대체
 * 예제 12-9 : 마우스를 이용한 선 그리기(repaint() 사용) */
public class prac12_10 extends JFrame {
    private MyPanel panel = new MyPanel();

    public prac12_10() {
        setTitle("drawing Line by Mouse 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac12_10();
    }

    class MyPanel extends JPanel {
        private Vector<Point> vStart = new Vector<Point>();
        private Vector<Point> vEnd = new Vector<Point>();

        public MyPanel() {
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    Point startP = e.getPoint();
                    vStart.add(startP);
                }

                public void mouseReleased(MouseEvent e) {
                    Point endP = e.getPoint();
                    vEnd.add(endP);
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);

            for (int i = 0; i < vStart.size(); i++) {
                Point s = vStart.elementAt(i);
                Point e = vEnd.elementAt(i);
                g.drawLine((int) s.getX(), (int) s.getY(),
                        (int) e.getX(), (int) e.getY());
            }
        }
    }
}