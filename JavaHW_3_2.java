import java.util.Scanner;

public class JavaHW_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n < 1 || n > 18) {
                System.out.println("-1");
                continue;
            }

            for (int i = n; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            break;
        }

        sc.close();
    }
}
