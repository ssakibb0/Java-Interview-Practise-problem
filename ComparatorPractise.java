import java.util.*;

// Student Class
class Student {
    int rollno;
    String name;

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    @Override
    public String toString() {
        return rollno + " - " + name;
    }
}

// Sort by Name
class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

// Sort by Roll Number
class SortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

// Main Class
public class ComparatorPractise {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(103, "bbbakib"));
        list.add(new Student(101, "Aman"));
        list.add(new Student(102, "dos"));

        System.out.println("Original List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sort by Name
        Collections.sort(list, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Sort by Roll No
        Collections.sort(list, new SortByRoll());
        System.out.println("\nSorted by Roll No:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
