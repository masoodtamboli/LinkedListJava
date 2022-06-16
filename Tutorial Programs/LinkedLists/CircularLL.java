package LinkedLists;

public class CircularLL {
    class Node {
        private int data;
        private Node next;

        Node(int val) {
            this.data = val;
        }
    }

    Node head, tail;
    int size = 0;

    public void insertAtStart(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }

    public void insertAtEnd(int val) {
        if (head == null) {
            insertAtStart(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        node.next = head;
        size++;
        return;
    }

    public void insertMid(int val, int index) {
        if (index == 0 || head == null) {
            insertAtStart(val);
            return;
        }

        if (index == size) {
            insertAtEnd(val);
            return;
        }

        Node node = new Node(val);
        Node tempNode = getNode(index - 1);
        node.next = tempNode.next;
        tempNode.next = node;
        size++;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void removeDup() {
        Node node = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (node.next != head) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while (temp != tail) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println(tail.data + " -> ...");
    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertAtStart(10);
        list.insertAtStart(8);
        list.insertAtStart(8);
        list.insertAtStart(8);
        list.insertAtStart(7);
        list.insertAtEnd(20);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(40);
        list.insertMid(6, 0);
        list.removeDup();
        list.display();
    }
}
