import java.util.Scanner;

public class javaHW_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int square_x1 = 100;
        int square_y1 = 100;
        int square_x2 = 200;
        int square_y2 = 200;

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        sc.close();

        if (x1 > x2) {
            int tmp = x1;
            x1 = x2;
            x2 = tmp;
        }

        if (y1 > y2) {
            int tmp = y1;
            y1 = y2;
            y2 = tmp;
        }

        if (x2 < square_x1 || x1 > square_x2 || y2 < square_y1 || y1 > square_y2) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
