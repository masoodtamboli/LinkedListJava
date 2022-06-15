class Swap{
    public static void main(String[] args) {
       int a = 13;
       int b = 14650;
        swap(a, b);
    }

    static void swap(int a, int b){
        System.out.println("Before swap: " + a + " " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap: " + a + " " + b);
    }
}