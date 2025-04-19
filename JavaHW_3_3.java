import java.util.Scanner;

public class JavaHW_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.length() != 1 || input.charAt(0) < 'a' || input.charAt(0) > 'z') {
                System.out.println("-1");
                continue;
            }

            for (int i = input.charAt(0); i >= 'a'; i--) {
                for (char c = 'a'; c <= i; c++) {
                    System.out.print(c);
                }
                System.out.println();
            }
            break;
        }

        sc.close();
    }
}
