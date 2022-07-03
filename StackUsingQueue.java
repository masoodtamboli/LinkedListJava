import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {

    static void push(int val, Queue<Integer> q1, Queue<Integer> q2) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        q1.offer(val);

        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        push(10, q1, q2);
        push(20, q1, q2);
        push(30, q1, q2);

        System.out.println("Removed Elem: " + q1.poll());

        System.out.println("Removed Elem: " + q1.poll());

        q1.offer(40);

        System.out.println(q1);

    }
}
