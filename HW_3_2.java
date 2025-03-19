import java.util.Scanner;

public class HW_3_2 {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);

        line = input.nextInt();

        for(int i=line-1; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//test
// 123
// 234
// 345

