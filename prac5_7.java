abstract class Calculator { //Calculator
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}


public class prac5_7 extends Calculator { // prac5_7 -> GoodCalc
    public static void main(String[] args) {
        prac5_7 c = new prac5_7(); //prac5_7 -> GoodCalc
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[]{2, 3, 4}));
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum / a.length;
    }
}