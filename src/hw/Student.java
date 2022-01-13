package hw;

import java.io.Serializable;

public class Student implements Serializable {
    private final String firstName;
    private final String secondName;
    private final int age;

    public Student(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return "[Name: " + firstName + " " + secondName + ", Age: " + age+"]";
    }
}
