package CH_code.ch06;

import java.util.*;

public class HW6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            String[] token = input.split(" ");
            int num = token.length;
            System.out.println("어절 개수는 " + num);
        }
    }
}
