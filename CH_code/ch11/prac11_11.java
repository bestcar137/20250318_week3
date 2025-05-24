package CH_code.ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/** ListChangeEx를 prac11_11로 대체 */
public class prac11_11 extends JFrame {
    private JTextField tf = new JTextField(10);
    // 문자열을 저장할 벡터 생성 (리스트 항목 저장용)

    private Vector<String> v = new Vector<String>();
    // 벡터 v를 기반으로 JList 생성 (리스트 컴포넌트)

    private JList<String> nameList = new JList<String>(v);

    public prac11_11() {
        setTitle("리스트 변경 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("이름 입력 후 <Enter> 키"));
        c.add(tf);

        v.add("황기태"); // 초기 리스트
        v.add("이재문");

        nameList.setVisibleRowCount(5); // 리스트 길이
        nameList.setFixedCellWidth(100); // 리스트 폭(픽셀단위)

        c.add(new JScrollPane(nameList));

        setSize(300, 300);
        setVisible(true);
// JTextField에 ActionLister 등록. <Enter> 키 처리
        tf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();
                v.add(t.getText());
                t.setText("");
                nameList.setListData(v);
            }
        });
    }

    public static void main(String[] args) {
        new prac11_11();
    }
}