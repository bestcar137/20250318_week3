import java.util.Scanner;

public class javaHW_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pay = scanner.nextInt();
        scanner.close();

        int count;

        count = pay / 50000;
        if (count > 0) {
            System.out.printf("%d 50,000won bill%s%n", count, count > 1 ? "(s)" : "");
            pay %= 50000;
        }

        count = pay / 10000;
        if (count > 0) {
            System.out.printf("%d 10,000won bill%s%n", count, count > 1 ? "(s)" : "");
            pay %= 10000;
        }

        count = pay / 1000;
        if (count > 0) {
            System.out.printf("%d 1,000won bill%s%n", count, count > 1 ? "(s)" : "");
            pay %= 1000;
        }

        count = pay / 500;
        if (count > 0) {
            System.out.printf("%d 500won coin%s%n", count, count > 1 ? "(s)" : "");
            pay %= 500;
        }

        count = pay / 100;
        if (count > 0) {
            System.out.printf("%d 100won coin%s%n", count, count > 1 ? "(s)" : "");
            pay %= 100;
        }

        count = pay / 50;
        if (count > 0) {
            System.out.printf("%d 50won coin%s%n", count, count > 1 ? "(s)" : "");
            pay %= 50;
        }

        count = pay / 10;
        if (count > 0) {
            System.out.printf("%d 10won coin%s%n", count, count > 1 ? "(s)" : "");
            pay %= 10;
        }

        count = pay;
        if (count > 0) {
            System.out.printf("%d 1won coin%s%n", count, count > 1 ? "(s)" : "");
        }
    }
}
