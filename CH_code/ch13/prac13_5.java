package CH_code.ch13;
/**
 * 예제 13-5 : 타이머 스레드 강제 종료
 * 아래 그림과 같이 작동하여 타이머 스레드를 강제 종료시키는 스윙 응용프로그램을 작성해보자.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerRunnable_ implements Runnable {
    private JLabel timerLabel;

    public TimerRunnable_(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;

        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;

            try {
                Thread.sleep(1000); // 1초 동안 잠을 잔다.
            } catch (InterruptedException e) {
                return; // 예외가 발생하면 스레드 종료
            }
        }
    }
}

/**
 * ThreadInterruptEx를 prac13_5로 대체
 */
public class prac13_5 extends JFrame {
    private Thread th;

    public prac13_5() {
        setTitle(" hreadInterruptEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

        TimerRunnable runnable = new TimerRunnable(timerLabel);
        th = new Thread(runnable); // 스레드 생성
        c.add(timerLabel);

        // 버튼을 생성하고 Action 리스너 등록
        JButton btn = new JButton("kill Timer");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt(); // 타이머 스레드 강제 종료

                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false); // 버튼 비활성화
            }
        });

        c.add(btn);
        setSize(300, 170);
        setVisible(true);
        th.start(); // 스레드 동작시킴
    }

    public static void main(String[] args) {
        new prac13_5();
    }
}