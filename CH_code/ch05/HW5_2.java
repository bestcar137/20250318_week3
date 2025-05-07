package CH_code.ch05;

import java.util.Scanner;

public class HW5_2 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}


//
 // 여기서부터 작성
//
class Km2Mile extends Converter {
    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }


    @Override
    public double convert(double src) {
        return src / ratio;
    }

    @Override
    public String getDestString() {
        return "Mile";
    }
}

//
 //여기까지 작성됨
//
abstract class Converter {
    protected double ratio;

    abstract protected double convert(double src);

    abstract protected String getDestString();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다.");
        scanner.close();
    }
}