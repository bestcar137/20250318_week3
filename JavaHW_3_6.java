import java.util.Scanner;

public class JavaHW_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                System.out.println(n1 * n2);
                break;
            } catch (Exception e) {
                System.out.println("-1");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
