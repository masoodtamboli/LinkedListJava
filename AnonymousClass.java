class Greeting{
    void sayHello(){
        System.out.println("Hello");
    }
}

//We have to override this method cause 
class India{
    Greeting g = new Greeting(){
        void sayHello(){
            System.out.println("Namaste");
        }
    };
}

public class AnonymousClass {
    public static void main(String[] args) {
        India india = new India();
        india.g.sayHello();
    }
}
