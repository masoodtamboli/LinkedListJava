class Outer{
    static int x=10;
    static class Inner{
        void meth1(){
            System.out.println("In F1 "+x);
        }
    }
}

public class NestedClass {
   public static void main(String[] args) {
    // Outer out = new Outer();
    // Outer.Inner o1 = out.new Inner();
    Outer.Inner o1 = new Outer.Inner();
    o1.meth1();
   }
}
