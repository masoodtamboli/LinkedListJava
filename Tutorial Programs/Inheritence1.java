
class A{
    public void get(){
        System.out.println("In A");
    }
}

class B extends A{
    public void get(){
        System.out.println("In B");
    }
}

public class Inheritence1 {
    public static void main(String[] args) {
        A b = new B();
        b.get();
    }
}
