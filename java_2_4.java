import java.util.Scanner;

public class java_2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        String op = sc.next();
        float b = sc.nextFloat();

        sc.close();

        if (op.equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op.equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op.equals("*")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("False");

            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        }
    }
}
