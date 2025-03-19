package comp249_section_s;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {

    public static void main(String[] args) {

        ArrayList<String> myStrings = new ArrayList<>(10); // Initial capacity, NOT limit

        myStrings.add("Hello");
        myStrings.add("Bye");

        System.out.println("Before sort: ");
        for (String s : myStrings) {
            System.out.println(s);
        }
        Collections.sort(myStrings);

        System.out.println("After sort: ");

        for (String s : myStrings) {
            System.out.println(s);
        }

        ArrayList<Course> objs = new ArrayList<>(5);

        Collections.sort(objs); // Looks for compareTo that takes Object

        Course c1 = new Course();

    }

}

class Course implements Comparable {

    private String code;
    private String title;
    private double creditPoints;

    @Override
    public int compareTo(Object otherObject) {
        // Make sure you can cast
        Course otherCourse = (Course) otherObject;
        if (this.creditPoints < otherCourse.creditPoints) {
            return -1;
        } else if (this.creditPoints > otherCourse.creditPoints) {
            return 1;
        } else {
            return 0;
        }
    }

}
