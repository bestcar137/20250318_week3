package CH_code.ch12;

import javax.swing.*;
import java.awt.*;

/** GraphicsDrawImageEx3를 prac12_8로 대체
 * ppt의 예제 12-7(2) */
public class prac12_8 extends JFrame {
    private MyPanel panel = new MyPanel();

    public prac12_8() {
        setTitle("이미지 일부분을 크기 조절하여 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/image0.jpg");
        private Image img = icon.getImage();

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
        }
    }

    public static void main(String[] args) {
        new prac12_8();
    }
}