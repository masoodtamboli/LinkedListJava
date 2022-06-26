interface I1 {
    void fun1();
}

interface I2 {
    void fun2();
}

class A implements I1, I2 {

    @Override
    public void fun2() {
        System.out.println("IN Fun2");
    }

    @Override
    public void fun1() {
        System.out.println("IN Fun1");

    }

}

public class Interface1 {
    public static void main(String[] args) {
        // I1 a1 = new A();
        A a1 = new A();
        a1.fun1();
        a1.fun2(); // This will show error if I create refernce variable if line (26) is uncommented 
    }
}
