package CH_code.ch07;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
    public abstract void draw();
}

class Line extends Shape {
    public void draw() {
        System.out.println("CH_code.ch07.Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("CH_code.ch07.Rect");
    }
}

class circle extends Shape {
    public void draw() {
        System.out.println("CH_code.ch06.Circle");
    }
}

public class HW7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape> v = new Vector<>();

        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int cmd = sc.nextInt();

            switch (cmd) {
                case 1:
                    System.out.print("CH_code.ch07.Line(1), CH_code.ch07.Rect(2), CH_code.ch06.Circle(3)>>");
                    int type = sc.nextInt();
                    switch (type) {
                        case 1:
                            v.add(new Line());
                            break;
                        case 2:
                            v.add(new Rect());
                            break;
                        case 3:
                            v.add(new circle());
                            break;
                    }
                    break;

                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int index = sc.nextInt();
                    if (index < 0 || index >= v.size()) {
                        System.out.println("삭제할 수 없습니다.");
                    } else {
                        v.remove(index);
                    }
                    break;

                case 3:
                    for (int i = 0; i < v.size(); i++) {
                        v.get(i).draw();
                    }
                    break;

                case 4:
                    System.out.println("프로그램종료");
                    return;
            }
        }
    }
}
