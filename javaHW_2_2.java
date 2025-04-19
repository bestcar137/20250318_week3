import java.util.Scanner;

public class javaHW_2_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}