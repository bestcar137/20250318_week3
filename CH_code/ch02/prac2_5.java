package CH_code.ch02;

import java.util.Scanner;

public class prac2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time, second, minute, hour;
        time = sc.nextInt();
        second = time % 60;
        minute = time / 60 % 60;
        hour = time / 60 / 60 % 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간" + minute + "분" + second + "초 입니다.");
        sc.close();
    }
}