package comp249_section_s;

public class Person {

    // Name (String)
    private String name;
    // Age (int)
    private int age;
    // Address (String)
    private String address;

    // Parametrized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Default constructor
    public Person() {
        this("Unknown name", 0, "Unknow address"); // calls another constructor

        //this.name = "Unknown name";
        //this.age = 0;
        //this.address = "Unknown address";
    }

}
