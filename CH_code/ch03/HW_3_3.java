package CH_code.ch03;

import java.util.Scanner;

public class HW_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);


        while (c <= 'a') ;
        {
            c = (char) (c - 1);
            System.out.print(c);

        }
    }
}