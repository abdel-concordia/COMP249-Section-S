package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        // Use the parameterized constructor
        Person person1 = new Person("John", 10, "Montreal");

        // Using the default constructor
        Person person2 = new Person();

        // Using the copy constructor
        Person person3 = new Person(person1);

        boolean b = person1.equals(person2);

        System.out.println(person1);

    }

}
