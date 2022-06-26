class A {
    void show() {
        System.out.println("In Asdsdssdsdsds");
    }
}

class C extends A {
    void show() {
        System.out.println("IN C");
    }
}

class B extends C {
    void show() {
        System.out.println("IN Bsdsdsdsd");
    }
}

public class Inheritence1 {
    public static void main(String[] args) {
        C a1 = new B();
        a1.show();
    }
}
