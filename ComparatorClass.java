import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Empolyee{
    String name;
    int age;
    int id;

    Empolyee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + id;
    }
}

class NameComparator implements Comparator<Empolyee>{

    @Override
    public int compare(Empolyee o1, Empolyee o2) {
        return o1.name.compareTo(o2.name);
    }

}

public class ComparatorClass {
    public static void main(String[] args) {
        ArrayList<Empolyee> emp = new ArrayList<>();
        Empolyee e1 = new Empolyee("Masood", 22, 7);
        emp.add(e1);
        emp.add(new Empolyee("Gaurav", 21, 10));
        emp.add(new Empolyee("Teja", 20, 9));
        System.out.println(emp);
        Collections.sort(emp, new NameComparator());
        System.out.println(emp);
    }
}

