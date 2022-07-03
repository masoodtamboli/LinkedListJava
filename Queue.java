class MyQueue <T>{
    private T[] arr;
    private int front, rear;

    MyQueue(int size){
        arr = (T[]) new Object[size];
        front = -1;
        rear = -1;

    }

    boolean offer(T val){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        if(front == -1){
            front++;
            rear++;
            arr[front] = val;
            return true;
        }
        rear++;
        arr[rear] = val;
        return true;
    }

  

    T poll(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        T x = arr[front];
        front++;
        return x;
    }

    T peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }

        return arr[front];
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i]  + " ");
        }
    }

    private boolean isFull() {
        return front>rear;
    }
    private boolean isEmpty() {
        return rear==-1;
    }
}

public class Queue {
    public static void main(String[] args) {
        MyQueue<String> q1 = new MyQueue<String>(1000);
        q1.offer("M");
        q1.offer("A");
        q1.offer("S");
        q1.offer("O");
        q1.offer("O");
        q1.offer("D");
        q1.display();
        System.out.println();
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println();
        q1.display();
        System.out.println();
        System.out.println(q1.peek());

        
    }
}
