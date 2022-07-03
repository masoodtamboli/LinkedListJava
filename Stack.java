class MyStack<T> {
    private int MAX;
    private T[] arr;
    private int top;

    MyStack(int size){
        MAX = size;
        top = -1;
        arr =  (T[]) new Object[MAX];
    }

    T push(T val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return null;
        }
        top++;
        arr[top] = val;
        return arr[top];
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return null;
        }
        T x = arr[top--];

        return x;
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return null;
        }
        return arr[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top >= (MAX - 1);
    }

}

public class Stack {
    public static void main(String[] args) {
        MyStack<String> s1 = new MyStack<>(100);
        s1.push("M");
        s1.push("A");
        s1.push("S");
        s1.push("O");
        s1.push("O");
        s1.push("D");
        s1.display();
        s1.pop();
        s1.pop();
        s1.display();
    }
}