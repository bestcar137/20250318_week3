package CH_code.ch13;
/**
 * 예제 13-6 : flag를 이용한 스레드 강제 종료
 * 아래 그림과 같이 프로그램이 시작하자마자 0.3초 주기로 "Java" 문자열을 임의의 위치에 생성하는 스
 * 레드를 만들어라.그리고 컨텐트팬에 마우스를 클릭하면 이 스레드를 종료시키고 "finish" 문자열을
 * (100, 100) 위치에 출력하라.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
    private Container contentPane;
    private boolean flag = false;   // 스레드의 종료 명령을 표시하는 플래그. true : 종료 지시

    public RandomThread(Container contentPane) {
        this.contentPane = contentPane;
    }

    void finish() {     // 스레드 종료 명령을 flag에 표시
        flag = true;
    }

    @Override
    public void run() {
        while (true) {
            int x = ((int) (Math.random() * contentPane.getWidth()));
            int y = ((int) (Math.random() * contentPane.getHeight()));

            JLabel label = new JLabel("Java");  // 새 레이블 생성
            label.setSize(80, 30);
            label.setLocation(x, y);

            contentPane.add(label);
            contentPane.repaint();

            try {
                Thread.sleep(300);  // 0.3초 동안 잠을 잔다.
                if (flag == true) {
                    contentPane.removeAll();

                    label = new JLabel("finish");

                    label.setSize(80, 30);
                    label.setLocation(100, 100);
                    label.setForeground(Color.RED);

                    contentPane.add(label);
                    contentPane.repaint();
                    return; // 스레드 종료
                }
            } catch (InterruptedException e) {
                return;
            }

        }
    }

    /**
     * ThreadFinishFlagEx를 prac13_6으로 대체
     */
    public static class prac13_6 extends JFrame {
        private RandomThread th;    // 스레드 레퍼런스

        public prac13_6() {
            setTitle("ThreadFinishFlagEx 예제");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container c = getContentPane();
            c.setLayout(null);

            c.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    th.finish();    // RandomThread 스레드 종료 명령
                }
            });
            setSize(300, 200);
            setVisible(true);

            th = new RandomThread(c);   // 스레드 생성
            th.start();                 // 스레드 동작시킴
        }

        public static void main(String[] args) {
            new prac13_6();
        }
    }
}