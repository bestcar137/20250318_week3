package CH_code.ch09; /**
 * 예제 prac11_9.java-5 : GridLayout으로 입력 폼 만들기
 * 아래 화면과 같이 사용자로부터 입력받는 폼을 스윙 응용프로그램을 작성하라.
 */

import javax.swing.*;
import java.awt.*;

/** GridLayout를 prac9_5로 대체 */
public class prac9_5 extends JFrame {   // CH_code.ch09.prac9_5 >> GridLayout
    public prac9_5() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);
        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac9_5();
    }
}