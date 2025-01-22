package comp249_section_s;

public class Person {

    // Name (String)
    private String name;
    // Age (int)
    private int age;
    // Address (Address)
    private Address address;

    // Parametrized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Default constructor
    public Person() {
        this("Unknown name", 0, "Unknow address"); // calls another constructor
    }

    // Copy constructor (watch out!!)
    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age, otherPerson.address);
    }

    // Getters
    public String getName() {
        return this.name; // privacy leak??
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Person otherPerson) { // Will be improved later
        if (otherPerson == null) {
            return false;
        }

        if (this.name.equals(otherPerson.name) && this.age == otherPerson.age) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "This is " + this.name + " whose age is " + this.age;
    }
}
