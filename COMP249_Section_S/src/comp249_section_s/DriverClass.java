package comp249_section_s;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Address ad = new Address(123, "Sherbrooke", "Montreal");

        Person p1 = new Person("John", 20, ad);

        Student s1 = new Student("Ali", 20, ad, "7755", 4.0);

        Person p2 = new Person(p1);

        Person p3 = new Person(s1);
        Person p4 = (Person) s1.clone();

    }

}

class A {

    int x;

    public void f() {
        System.out.println("This is f in A");
    }
}

class B extends A {

    int y;

    @Override
    public void f() {
        System.out.println("This is f in B");
    }
}

class C extends B {

    int z;

    @Override
    public void f() {
        System.out.println("This is f in C");
    }
}
