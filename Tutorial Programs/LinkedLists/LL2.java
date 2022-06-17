package LinkedLists;

public class LL2 {
    class Node {
        private int data;
        private Node next;

        Node(int val) {
            this.data = val;
        }

        Node() {

        }

    }

    Node head, tail;
    int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertEnd(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertIndex(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertEnd(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public int deleteFisrt() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        int deleted = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return deleted;
    }

    public int deleteEnd() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        }

        if (size <= 1) {
            deleteFisrt();
        }

        Node secondLast = getNode(size - 1);
        int deleted = tail.data;

        tail = secondLast;
        tail.next = null;

        size--;

        return deleted;
    }

    public int deleteIndex(int index) {
        if (head == null) {
            System.out.println("Linked List is Empty");
        }

        if (index > size) {
            System.out.println("Index out of Bound");
            return -1;
        }
        if (index == size) {
            int deleted = deleteEnd();
            return deleted;
        }

        if (index == 0) {
            int deleted = deleteFisrt();
            return deleted;
        }

        Node tempNode = getNode(index - 1);
        int deleted = tempNode.data;
        tempNode.next = tempNode.next.next;
        size--;

        return deleted;

    }

    public int search(int val) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        if (head.data == val) {
            return 0;
        }

        if (tail.data == val) {
            return size;
        }

        Node temp = head;
        for (int i = 1; i < size; i++) {
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

    public void removeDup() {
        Node node = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void display(Node l1) {
        Node temp = l1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void mergeSorted(Node list1, Node list2) {
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        Node l1 = list1;
        Node l2 = list2;

        LL2 ans = new LL2();
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
               ans.insertEnd(l1.data);
               l1 = l1.next; 
            }else{
                ans.insertEnd(l2.data);
                l2 = l2.next;
            }
        }

        while(l1 != null){
            ans.insertEnd(l1.data);
            l1 = l1.next;
        }

        while(l2 != null){
            ans.insertEnd(l2.data);
            l2 = l2.next;
        }

        ans.display(ans.head, null);
    }

    public void display(Node l1, Node l2) {
        Node temp = l1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");

        Node temp1 = l2;
        while (temp1 != null) {
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL2 list = new LL2();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(7);
        list.insertEnd(10);

        LL2 list2 = new LL2();
        list2.insertEnd(3);
        list2.insertEnd(7);
        list2.insertEnd(9);
        list2.insertEnd(10);
        list2.insertEnd(15);

        // System.out.println("size "+ list.size );
        // System.out.println("Removed Element: "+ list.deleteFisrt());
        // System.out.println("Removed Element: "+ list.deleteFisrt());
        // System.out.println("Removed Element: "+ list.deleteEnd());
        // System.out.println("Removed Element: "+ list.deleteEnd());
        // System.out.println("Removed Element: "+ list.deleteIndex(3));
        // System.out.println("Removed Element: "+ list.deleteIndex(7));
        // System.out.println("Searched ELement Index: " + list.search(30));
        // list.removeDup();
        
        list.display(list.head, list2.head);
        list.mergeSorted(list.head, list2.head);
    }

}
