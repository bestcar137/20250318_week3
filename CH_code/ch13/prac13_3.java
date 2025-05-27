package CH_code.ch13; /**
 * 예제 13-3 : 깜박이는 문자열을 가진 레이블 만들기
 * JLabel을 상속받아 문자열을 깜박이는 FlickeringLabel 컴포넌트를 작성하라.
 */

import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
    private long delay; // 깜빡이는 간격 저장

    public FlickeringLabel(String text, long delay) {
        super(text);    // JLabel 생성자 호출, 텍스트 초기화
        this.delay = delay;

        setOpaque(true);
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        int n = 0;

        while (true) {
            if (n == 0)
                setBackground(Color.YELLOW);
            else
                setBackground(Color.GREEN);

            if (n == 0) n = 1; // n을 번갈아 바꿈 0 <-> 1
            else n = 0;

            try {
                Thread.sleep(delay);    // 시간 간격 반복

            } catch (InterruptedException e) {
                return;
            }

        }
    }
}

/** FlickeringLabelEx를 prac13_3으로 대체 */
public class prac13_3 extends JFrame {  // FlickeringLabelEx >> prac13_3

    /** FlickeringLabelEx를 prac13_3으로 대체 */
    public prac13_3() { //
        setTitle("FlickeringLabelEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

// 깜박이는 레이블 생성
        FlickeringLabel fLabel = new FlickeringLabel("깜박", 500);

// 깜박이지 않는 레이블 생성
        JLabel label = new JLabel("안깜박");

// 깜박이는 레이블 생성
        FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박", 300);

        c.add(fLabel);
        c.add(label);
        c.add(fLabel2);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac13_3();
    }
}