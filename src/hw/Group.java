package hw;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Group implements Serializable {
    private final String name;
    private final Student[] students = new Student[3];

    public Group(String name){
        this.name = name;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length + 1; i++) {

            try {
                if (i >= students.length) {
                    throw new TheGroupIsFullException();
                }

                if (students[i] == null) {
                    students[i] = student;
                    System.out.println("student was added");
                    break;
                }
            } catch (TheGroupIsFullException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void sortStudentByLastName() {
        Arrays.sort(students, Comparator.nullsLast(new CompareBySecondName()));
    }

    public String toString() {
        this.sortStudentByLastName();
        return "Group " + this.name + ": " + Arrays.toString(students);
    }
}
