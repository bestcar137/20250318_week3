package CH_code.ch09; /**
 * 예제 prac11_9.java-3 : FlowLayout 배치관리자 활용
 * 수평 간격이 30, 수직 간격을 40픽셀로 설정
 * LEFT로 정렬 배치하는 FlowLayout 배치관리자를 가진 컨텐트팬에
 * 5개의 버튼 컴포넌트를 부착한 스윙 응용프로그램을 작성하라.
 */

import javax.swing.*;
import java.awt.*;

/** FlowLayoutEx를 prac9_3으로 대체 */
public class prac9_3 extends JFrame {   // CH_code.ch09.prac9_3 >> FlowLayoutEx
    public prac9_3() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac9_3();
    }
}