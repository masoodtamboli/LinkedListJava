class A{
    void test(){
        System.out.println("Hello World");
    }
}

class B extends A{
    void test(){
        System.out.println("B.test()");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}
