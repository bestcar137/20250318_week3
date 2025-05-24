package CH_code.ch12;

import javax.swing.*;
import java.awt.*;

/** GraphicsClipEx를 prac12_9로 대체
 * 예제 12-9 : 클리핑 영역에 그리기 */
public class prac12_9 extends JFrame {
    private MyPanel panel = new MyPanel();

    public prac12_9() {
        setTitle("클리핑 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 400);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/image0.jpg");
        private Image img = icon.getImage(); // 이미지 객체

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setClip(100, 20, 150, 150);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.ITALIC, 40));
            g.drawString("Go Gator!!", 10, 150);
        }
    }

    public static void main(String[] args) {
        new prac12_9();
    }
}