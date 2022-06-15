package LinkedLists;

public class LL2 {
    class Node{
        private int data;
        private Node next;

        Node(int val){
            this.data = val;
        }

    }

    Node head, tail;
    int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertEnd(int val){
        if(head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;

    }

    public void insertIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertEnd(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public int deleteFisrt(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        int deleted = head.data;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;

        return deleted;
    }

    public int deleteEnd(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }

        if(size <= 1){
            deleteFisrt();
        }

        Node secondLast = getNode(size-1);
        int deleted = tail.data;

        tail = secondLast;
        tail.next = null;

        size--;

        return deleted;
    }

    

    public int deleteIndex(int index){
        if(head == null){
            System.out.println("Linked List is Empty");
        }

        if(index > size){
            System.out.println("Index out of Bound");
            return -1;
        }
        if(index == size){
            int deleted  = deleteEnd();
            return deleted;
        }

        if(index == 0){
            int deleted = deleteFisrt();
            return deleted;
        }


        Node tempNode = getNode(index-1);
        int deleted = tempNode.data;
        tempNode.next = tempNode.next.next;
        size--;

        return deleted;

    }  

    public int search(int val){
        if(head == null){
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
        for(int i=1; i<size; i++){
            if(temp.data == val){
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }

    public Node getNode(int index){
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        return temp;
    }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL2 list = new LL2();
        list.insertFirst(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertIndex(35, 3);
        list.insertIndex(5, 0);
        list.insertIndex(45, 6);
        list.display();
        // System.out.println("size "+ list.size );
        // System.out.println("Removed Element: "+ list.deleteFisrt());
        // System.out.println("Removed Element: "+ list.deleteFisrt());
        // System.out.println("Removed Element: "+ list.deleteEnd());
        // System.out.println("Removed Element: "+ list.deleteEnd());
        // System.out.println("Removed Element: "+ list.deleteIndex(3));
        // System.out.println("Removed Element: "+ list.deleteIndex(7));
        System.out.println("Searched ELement Index: " + list.search(30));
        list.display();
    }

   
}
