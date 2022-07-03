class MyCQ {
    private int[] arr;
    private int front;
    private int rear;
    private int MAX;

    MyCQ(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        MAX = size;
    }

    boolean offer(int val) {
        if ((rear == MAX - 1 && front == 0) || rear == front - 1) {
            System.out.println("Queue is Full");
            return false;
        }
        if (front == -1) {
            front++;
            rear++;
            arr[rear] = val;
            return true;
        }

        if (rear == MAX - 1 && front != 0) {
            rear = 0;
            arr[rear] = val;
            return true;
        }

        rear++;
        arr[rear] = val;
        return true;

    }

    int poll() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (front == rear) {
            int x = arr[front];
            rear = -1;
            front = -1;
            return x;
        }

        if (front == MAX - 1) {
            int x = arr[front];
            front = 0;
            return x;
        }

        int x = arr[front];
        front++;
        return x;
    }

    void display(){
        if(front > rear){
            for(int i=front; i<=MAX-1; i++){
                System.out.print(arr[i] + " ");
            }
    
            for(int i=0; i<=rear; i++){
                System.out.print(arr[i]+ " " );
            }
        }

        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        MyCQ q1 = new MyCQ(5);
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);
        q1.display();
        q1.poll();
        q1.poll();
        q1.poll();
        q1.offer(60);
        q1.offer(70);
        q1.display();
        
    }
}
