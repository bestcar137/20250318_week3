package CH_code.ch11;

import javax.swing.*;
import java.awt.*;

/** SliderEx를 prac11_14로 대체 */
public class prac11_14 extends JFrame {

    public prac11_14() {

        setTitle("슬라이더 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);

        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);

        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);

        c.add(slider);

        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac11_14();
    }
}

