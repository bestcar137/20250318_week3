package CH_code.ch11;

import javax.swing.*;
import java.awt.*;

/** ListEx를 prac11_10으로 대체 */
public class prac11_10 extends JFrame {
    private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear",
            "peach", "berry", "strawberry", "blackberry"};

    private ImageIcon[] images = {
            new ImageIcon("images/icon1.png"),
            new ImageIcon("images/icon2.png"),
            new ImageIcon("images/icon3.png"),
            new ImageIcon("images/icon4.png")};

    public prac11_10() {
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JList<String> strList = new JList<String>(fruits);
        c.add(strList);

        JList<ImageIcon> imageList = new JList<ImageIcon>();
        imageList.setListData(images);
        c.add(imageList);

        JList<String> scrollList = new JList<String>(fruits);
        c.add(new JScrollPane(scrollList));

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac11_10();
    }
}