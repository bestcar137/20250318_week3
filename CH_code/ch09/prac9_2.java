package CH_code.ch09; /**
 * 예제 prac11_9.java-2 : 3개의 버튼 컴포넌트를 가진 스윙프레임 만들기
 * 다음 그림과 같이 컨텐트팬의 배경색을 오렌지색으로 설정
 * 이곳에 OK, Cancel, Ignore 버튼들을 부착한 스윙 프로그램을 작성하라.
 */

import javax.swing.*;
import java.awt.*;

/** ContentPaneEx를 prac9_2로 대체 */
public class prac9_2 extends JFrame {   // CH_code.ch09.prac9_2 >> ContentPaneEx
    public prac9_2() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac9_2();
    }
}
