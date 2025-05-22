/** 예제 11-1 : 스윙 컴포넌트의 공통 기능, JComponent의 메소드 */
package CH_code.ch11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** JComponentEx를 prac11_1로 대체 */
public class prac11_1 extends JFrame {  // prac11_1 >> JComponentEx

    public prac11_1() {
        super("JComponent의 공통 메소드 예제");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta/Yellow Button");
        JButton b2 = new JButton(" Disabled Button ");
        JButton b3 = new JButton("getX(), getY()");

        b1.setBackground(Color.YELLOW); // 배경색 설정
        b1.setForeground(Color.MAGENTA); // 글자색 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정

        b2.setEnabled(false); // 버튼 비활성화

        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                prac11_1 frame = (prac11_1) b.getTopLevelAncestor();
                frame.setTitle(b.getX() + "," + b.getY()); // 최상위 부모 컨테이너 리턴
            }                                              // 타이틀에 버튼 좌표 출력
        });

        c.add(b1);
        c.add(b2);
        c.add(b3); // 컨텐트팬에 버튼 부착

        setSize(260, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac11_1();
    }
}