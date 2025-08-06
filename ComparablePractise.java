import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ComparablePractise {
    static class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // Default sort by roll number
    @Override
    public int compareTo(Student s) {
        return this.roll - s.roll;
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }
}

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(103, "Sakib"));
        list.add(new Student(101, "Aman"));
        list.add(new Student(102, "Zara"));

        Collections.sort(list);  // uses Comparable

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
