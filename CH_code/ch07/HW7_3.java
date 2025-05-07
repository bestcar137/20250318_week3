package CH_code.ch07;

import java.util.*;

public class HW7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager cm = new CustomerManager();
        while (true) {
            String name = sc.next();
            if (name.equals("그만")) break;
            int point = sc.nextInt();
            cm.addCustomer(name, point);
            cm.printAll();
        }
    }
}

class CustomerManager {
    private HashMap<String, Integer> map = new HashMap<>();

    public void addCustomer(String name, int point) {
        if (map.containsKey(name)) {
            map.put(name, map.get(name) + point);
        } else {
            map.put(name, point);
        }
    }

    public void printAll() {
        for (String name : map.keySet()) {
            System.out.print("(" + name + ", " + map.get(name) + ")");
        }
        System.out.println();
    }
}
