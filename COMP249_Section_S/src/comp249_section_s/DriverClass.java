package comp249_section_s;

import old_classes.Address;

public class DriverClass {

    public static void main(String[] args) {

        Address ad = new Address(123, "Sherbrook ", "Montreal");

        try {
            Person p = new Person("John", 10, null);
            System.out.println("Person created successfully.");

        } catch (Exception e) {
            System.out.println("Error creating Person: " + e.getMessage());
        } finally {
            System.out.println("This is finally clause.");
        }
    }
}
