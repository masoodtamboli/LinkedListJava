import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("C");
        arr.add("B");
        PriorityQueue<String> pq = new PriorityQueue<>(arr);
        // pq.offer(10);
        // pq.offer(20);
        // pq.offer(30);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
