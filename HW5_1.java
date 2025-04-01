public class HW5_1 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    // Add code here...
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    protected int getColor() {
        return color;
    }


}

class IPTV extends ColorTV {
    // Add code here...
    private String ip;

    public IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    public void printProperty() {
        System.out.print("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    }
}