package old_classes;

import old_classes.Address;

public class Person {

    // Name (String)
    protected String name;
    // Age (int)
    protected int age;
    // Address (Address)
    protected Address address;

    // Parametrized (main) constructor
    public Person(String name, int age, Address address) {
        super();
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
    public boolean equals(Object otherObject) { // Person --> Person
        // Part 1: check if param is null
        if (otherObject == null) {
            return false;
        }

        // Part 2: check if otherObject is a Person
        // if no, return false
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        // if yes, cast it to Person and compare
        Person otherPerson = (Person) otherObject;

        // Now, compare
        if (this.name.equals(otherPerson.name) && this.age == otherPerson.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "This is " + this.name + " whose age is " + this.age;
    }

    @Override
    public Object clone() {
        return new Person(this);
    }

    private void f() {

    }

}
