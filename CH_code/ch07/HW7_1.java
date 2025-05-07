package CH_code.ch07;

import java.util.*;

public class HW7_1 {
    public static void printBig(Vector<Integer> v) {
        int max = 0;
        for (int n : v) {
            if (n > max) {
                max = n;
            }
        }
        System.out.print("정수(-1이 입력될 때까지)>> ");
        System.out.println("가장 큰 수는 " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            if (num > 0) v.add(num);
        }
        printBig(v);
    }
}

