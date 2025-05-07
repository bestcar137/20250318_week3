package CH_code.ch05;

class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Researcher {
}

public class prac5_4 { //InstanceOfEx
    static void print(Person p) {
        if (p instanceof Person)
            System.out.print("CH_code.ch05.Person ");
        if (p instanceof Student)
            System.out.print("CH_code.ch05.Student ");
        if (p instanceof Researcher)
            System.out.print("CH_code.ch05.Researcher ");
        if (p instanceof Professor)
            System.out.print("CH_code.ch05.Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new CH_code.ch05.Student() -> \t");
        print(new Student());
        System.out.print("new CH_code.ch05.Researcher() -> \t");
        print(new Researcher());
        System.out.print("new CH_code.ch05.Professor() -> \t");
        print(new Professor());
    }
}
