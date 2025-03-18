import java.util.Scanner;

public class prac_3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("나뉨수를 입력하시오.");
            int dividend = sc.nextInt();
            System.out.print("나눗수를 입력하시오.");
            int divisor = sc.nextInt();
            try {
                System.out.print(dividend + "를" + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }
}