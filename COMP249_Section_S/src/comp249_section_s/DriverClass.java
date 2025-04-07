package comp249_section_s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DriverClass {

    public static void main(String[] args) {

        ArrayList<A> arrayOfA = new ArrayList<>();

        Collections.sort(arrayOfA);

        Collections.sort(arrayOfA, new ComparatorBasedOnX()); // method1

        Collections.sort(arrayOfA, new ComparatorBasedOnY()); // method2 in class B

    }

}

class A implements Comparable {

    private int x;
    private int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override  // List<List<string>>
    public int compareTo(Object otherObject) {
        A otherA = (A) otherObject;
        return Integer.compare(this.x, otherA.x);
    }
}

class ComparatorBasedOnX implements Comparator<A> {

    @Override
    public int compare(A a1, A a2) {
        return Integer.compare(a1.getX(), a2.getX());
    }
}

class ComparatorBasedOnY implements Comparator<A> {

    @Override
    public int compare(A a1, A a2) {
        return Integer.compare(a1.getY(), a2.getY());
    }
}
