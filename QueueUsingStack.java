
import java.util.Stack;


public class QueueUsingStack {
    static int removeElem(Stack<Integer> s1, Stack<Integer> s2){
        while(!s1.empty()){
            s2.add(s1.pop());
        }

        int x = s2.pop();

        while(!s2.empty()){
            s1.add(s2.pop());
        }
        return x;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        s1.add(10);
        s1.add(20);
        s1.add(30);

        System.out.println("Removed Elem: "+ removeElem(s1, s2)); 

        s1.add(40);
        
        System.out.println("Removed Elem: "+ removeElem(s1, s2));
        
        System.out.println(s1);


    }
}
