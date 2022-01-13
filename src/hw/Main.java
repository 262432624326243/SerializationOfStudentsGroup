package hw;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Group TR509 = new Group("TR-509");
        Group newGroup = null;
        TR509.addStudent(new Student("Іван", "Моцний", 21));
        TR509.addStudent(new Student("Тарас", "Машина", 20));
        TR509.addStudent(new Student("Дмитро", "Молодий", 18));

        System.out.println("Old group:");
        System.out.println(TR509);
        writeGroup(TR509);

        System.out.println("New group:");
        newGroup = readGroup();
        System.out.println(newGroup);
    }

    public static void writeGroup(Group group) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("group.txt"))) {
            oos.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group readGroup() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("group.txt"))) {
            return (Group) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
