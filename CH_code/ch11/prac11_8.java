package CH_code.ch11;

import javax.swing.*;
import java.awt.*;

/** TextFieldEx를 prac11_8로 대체 */
public class prac11_8 extends JFrame {

    public prac11_8() {
        setTitle("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 "));
        c.add(new JTextField(20)); // 20열 너비 필드 생성

        c.add(new JLabel("학과 "));
        c.add(new JTextField("컴퓨터공학과 ", 20));

        c.add(new JLabel("주소 "));
        c.add(new JTextField("서울시 ...", 20));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac11_8();
    }
}