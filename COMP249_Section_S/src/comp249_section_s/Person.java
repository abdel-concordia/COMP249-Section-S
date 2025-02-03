package comp249_section_s;

public class Person extends Object {

    // Name (String)
    String name;
    // Age (int)
    private int age;
    // Address (Address)
    private Address address;

    // Parametrized (main) constructor
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address; // watch out
        //this.address = new Address(address);
    }

    // Default constructor
    public Person() {
        this("Unknown name", 0, new Address(0, "Unknown street name", "Unknown city name")); // calls another constructor
        // Can have some other statements
    }

    public Person(String name, int age, int streetNumber, String streetName, String cityName) {
        this(name, age, new Address(streetNumber, streetName, cityName)); // check this with the new constructor above!
    }

    // Copy constructor (watch out!!)
    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age, new Address(otherPerson.address));
    }

    // Getters
    public String getName() {
        return this.name; // privacy leak??
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return new Address(this.address);
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

    public void setAddress(Address address) {
        this.address = address; // watch out
    }

    @Override
    public boolean equals(Object otherObject) {
        // Part 1: check if param is null
        if (otherObject == null) {
            return false;
        }

        // Part 2: check ifotherObject is a Person
        // if no, return false
        // if yes, cat it to Person and compare
        if (this.name.equals(otherObject.name) && this.age == otherObject.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "This is " + this.name + " whose age is " + this.age;
    }

    private void f() {

    }

}
