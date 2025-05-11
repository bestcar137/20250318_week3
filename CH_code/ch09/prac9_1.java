package CH_code.ch09; /**
 * 예제 9 - 1 : 300 x 300 크기의 스윙 프레임 만들기
 * 300 x 300 크기의 스윙 프레임을 작성하라.
 */

import javax.swing.*;

/** MyFrame을 prac9_1로 대체 */
public class prac9_1 extends JFrame {
    public prac9_1() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        prac9_1 frame = new prac9_1();
    }
}