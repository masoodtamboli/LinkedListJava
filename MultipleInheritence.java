interface I1{
    default void fun1(){
        System.out.println("IN I1");
    }
}

interface I2{
    default void fun1(){
        System.out.println("In I2");
    }
}

class A implements I1, I2{

    @Override
    public void fun1() {
        System.out.println("IN A FUN1");
        
    }

}

public class MultipleInheritence {
    public static void main(String[] args) {
        A a = new A();
        a.fun1();
    }

    
}
