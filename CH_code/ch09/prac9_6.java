package CH_code.ch09; /**
 * 예제 prac11_9.java-prac11_6.java : 배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 크기로 지정
 * 원하는 위치에 원하는 크기로 컴포넌트를 마음대로 배치할 수 있다.
 */

import javax.swing.*;
import java.awt.*;

/** NullContainerEx를 prac9_6으로 대체 */
public class prac9_6 extends JFrame {   // CH_code.ch09.prac9_6 >> NullContainerEx
    public prac9_6() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        c.add(la);
        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i)); // 버튼 생성
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            c.add(b); // 버튼을 컨텐트팬에 부착
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac9_6();
    }
}