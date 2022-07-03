import java.util.ArrayList;
import java.util.List;

class CollectionMethods {
    CollectionMethods() {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        // Collection Interface Methods
        l1.add(10);
        l1.add(20);
        l2.add(30);
        l2.add(40);

        l1.addAll(l2);

        l1.remove(1);
        // l1.removeAll(l2);

        l1.retainAll(l2);

        // List Interface Methods

        System.out.println(l1);
    }
}

class ListMethods {
    ListMethods() {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(10);
        l1.add(0, 5); // Shifts all elements to right and adds 5 to index 0;

        l1.set(1, 9); // replaces elemnt
        System.out.println("Index of" + l1.indexOf(10));
        System.out.println("Get index 1" + l1.get(1));
        System.out.println("Get Last index of 10" + l1.lastIndexOf(10));

        List<Integer> l2 = new ArrayList<>();
        l2 = l1.subList(1, 3);
        System.out.println("Sublst" + l2);
    }
}

public class ListCF {
    public static void main(String[] args) {
        ListMethods lm = new ListMethods();
    }
}
