class Student<T1, T2, T3> {
    T1 name;
    T2 age;
    T3 marks;

    Student(T1 name, T2 age, T3 marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    T1 getName() {
        return this.name;
    }

    T2 getAge() {
        return this.age;
    }

    T3 getMarks() {
        return this.marks;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Student<String, Integer, Float> s1 = new Student<String, Integer, Float>("Masood", 22, 98.8f);
        System.out.println("Name: " + s1.getName() + " Age: " + s1.getAge() + " Marks: " + s1.getMarks());
    }

}
