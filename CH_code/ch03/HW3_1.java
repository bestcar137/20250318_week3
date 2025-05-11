package CH_code.ch03;

public class HW3_1 {
    public static void main(String[] args) {
        int[][] n = {   // c언어에서는 int n[][]
                {1}, {1, 2, 3,}, {1}, {1, 2, 3, 4}, {1, 2}};

        for (int[] ints : n) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        /*
          for (int i = 0; i < n.length; i++) {
             for (int j = 0; j < n[i].length; j++) {
                 System.out.print(n[i][j] + " ");
             }
             System.out.println();
         }
        */
    }
}
