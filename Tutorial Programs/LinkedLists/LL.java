package LinkedLists;
public class LL {
    class Node{
        private int val;
        private Node next;

        Node(int num){
            this.val = num;
        }

        Node(int num, Node next){
            this.val = num;
            this.next = next;
        }
    }    
    
    private Node head;
    private Node tail;
    int size;

    LL(){
        size = 0;
    }

    public void insertAtStart(int num){
        Node temp = new Node(num);
        temp.next = head;
        head = temp;

        if(tail == null){
            tail = temp;
        }

        size++;
    }

    public void insertAtEnd(int num){
        if(tail == null) {
            insertAtStart(num);
            return;
        }
        Node temp = new Node(num, null);
        tail.next = temp;
        tail = temp;
        size++;
    }

    public void insertAtMid(int num, int index){
       if(index == 0){
        insertAtStart(num);
        return;
       }
       if(index == 1){
        insertAtEnd(num);
        return;
       }
       Node temp = head;
       for(int i=1; i<index; i++){
        temp = temp.next;
       }

       Node node = new Node(num, temp.next);
       temp.next = node;
       size++;
    }

    public void delete(int value){
        if(size == 0){
            System.out.println("Linked List is Empty");
        }
        Node temp = head;
        while(temp.next != null){
            //Delete Mid of LinkedList
            if(temp.next.val == value){
                temp.next = temp.next.next;
            }

            //Delete start of LL
            if(temp.val == value){
                head = head.next;
            }
            if(temp.val == tail.val){

            }
            temp = temp.next;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(" NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtStart(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtStart(5);
        list.insertAtMid(25, 1);
        list.delete(25);
        list.delete(30);
        list.display();
    }
}

