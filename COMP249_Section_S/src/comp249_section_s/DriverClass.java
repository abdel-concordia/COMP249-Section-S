package comp249_section_s;

import old_classes.Address;

public class DriverClass {

    public static void main(String[] args) {

        Address ad = new Address(123, "Sherbrook ", "Montreal");

        try {
            Person p = new Person("John", -10, null);
            System.out.println("Person created successfully.");

        } catch (AgeException aex) {
            System.out.println("Age provided is not within the limits: " + aex.getMinAge() + " and " + aex.getMaxAge());
        } catch (Exception e) {
            System.out.println("Error creating Person: " + e.getMessage());
        }
    }
}
