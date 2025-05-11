package CH_code.ch02;

import java.util.Scanner;

public class HW2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        String op = sc.next();
        float b = sc.nextFloat();

        sc.close();

        switch (op) {
            case "+" -> System.out.println(a + " + " + b + " = " + (a + b));
            case "-" -> System.out.println(a + " - " + b + " = " + (a - b));
            case "*" -> System.out.println(a + " * " + b + " = " + (a * b));
            case "/" -> {
                if (b == 0) {
                    System.out.println("False");

                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
            }
        }

        /*
         * if문으로 작성 시
         * if (op.equals("+")) {
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
     */
    }
}
