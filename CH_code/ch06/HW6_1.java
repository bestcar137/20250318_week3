package CH_code.ch06;

public class HW6_1 {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 20);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b)) System.out.println("같은 원");
        else System.out.println("서로 다른 원");
    }
}

class Circle {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CH_code.ch06.Circle(" + x + "," + y + ")반지름" + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.x == c.x && this.y == c.y;
        }
        return false;
    }
}
