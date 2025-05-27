package CH_code.ch13; /**
 * 예제 13-2 : Runnable 인터페이스를 이용하여
 * 1초단위로 출력하는 타이머 스레드 만들기
 * public
 */

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }

        }
    }
}
/** RunnableTimerEx를 prac13_2로 대체 */
public class prac13_2 extends JFrame {  /// RunnableTimerEx >> JFrame

    public prac13_2() {
        setTitle("Runnable을 구현한 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerRunnable runnable = new TimerRunnable(timerLabel);
        Thread th = new Thread(runnable);

        setSize(250, 150);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new prac13_2();
    }
}