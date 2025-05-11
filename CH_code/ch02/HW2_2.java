package CH_code.ch02;

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();


        if (a + b > c && a + c > b && b + c > a) {  // 가독성 개선 > ((a + b > c) && (a + c > b) && (b + c > a))

            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
}
