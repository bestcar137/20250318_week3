package CH_code.ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HW6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(line, " ");
            int count = st.countTokens();
            System.out.println("어절 개수는 " + count);
        }
    }
}
