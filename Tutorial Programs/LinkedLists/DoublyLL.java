package LinkedLists;

public class DoublyLL {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            this.data = val;
        }

    }

    int size = 0;
    Node head, tail;

    public void insertFirst(int val) {
        Node node = new Node(val);

        if (head == null) {
            tail = node;
            head = node;
            size++;
            return;
        }

        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }

    public void insertEnd(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertIndex(int index, int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertEnd(val);
            return;
        }

        Node node = new Node(val);
        Node tempNode = getNode(index - 1);

        node.next = tempNode.next;
        tempNode.next.prev = node;

        tempNode.next = node;
        node.prev = tempNode;

        size++;

    }

    public int deleteStart() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        int deleted = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return deleted;
    }

    public int deleteEnd() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        int deleted = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return deleted;
    }

    public int deleteIndex(int index) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        if (index == size) {
            int deleted = deleteEnd();
            return deleted;
        }

        if (index == 0) {
            int deleted = deleteStart();
            return deleted;
        }

        if (index > size) {
            System.out.println("Index out of Bound");
            return -1;
        }

        Node tempNode = getNode(index);
        int deleted = tempNode.data;
        tempNode.prev.next = tempNode.next;
        tempNode.next.prev = tempNode.prev;
        size--;
        return deleted;
    }

    public int search(int val) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        if(head.data == val){
            return 0;
        }

        if(tail.data == val){
            return size;
        }

        Node temp = head;
        for (int i = 1; i <= size; i++) {
            if (temp.data == val) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        System.out.print("NULL <=> ");
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }

        System.out.println(" NULL");
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        // list.insertFirst(10);
        // list.insertFirst(5);
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);
        list.insertIndex(4, 35);
        list.deleteIndex(0);
        System.out.println(list.search(50));
        list.display();

    }

}
