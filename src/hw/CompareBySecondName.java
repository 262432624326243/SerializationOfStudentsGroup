package hw;

import java.util.Comparator;

public class CompareBySecondName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        String secondName1 = student1.getSecondName();
        String secondName2 = student2.getSecondName();

        if (secondName1.compareTo(secondName2) > 0) {
            return 1;
        } else if (secondName1.compareTo(secondName2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
