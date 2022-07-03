import java.util.Arrays;

public class Generic {
    public void disp(Object []msg){
        System.out.println(Arrays.toString(msg));
    }

    public <T> void disp2(T[] msg){
        System.out.println(Arrays.toString(msg));
    }
    public static void main(String[] args) {
        Generic g = new Generic();
        // int k = 19;
        // g.disp(k);
        // g.disp("Hello");
        // g.disp(10);
        // g.disp(1.2);
        Integer[] arr = {10,203,40,50};
        g.disp(arr);
    }
}
