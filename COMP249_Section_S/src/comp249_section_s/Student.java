package comp249_section_s;

public class Student extends Person {

    // Name: Inherited
    // Age: Inherited
    // Address: Inherited
    // ID
    private String id;
    // GPA
    private double gpa;

    public Student(String name, int age, Address address, String id, double gpa) {
        // Construct the Person part
        super(name, age, address); // A call to Person constructor
        // Construct the Extra in student
        this.id = id;
        this.gpa = gpa;
    }

    public Student(String id, double gpa) {
// Implicit call to default constructor in Person
        this.id = id;
        this.gpa = gpa;
    }

    public Student(Student otherStudent) {
        this(otherStudent.name, otherStudent.age, otherStudent.address, otherStudent.id, otherStudent.gpa);
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getID() {
        return this.id;
    }

    public double getGPA() {
        return this.gpa;
    }

    // toString
    @Override
    public String toString() {
        return "This is student " + this.name + " with ID " + this.id + " and GPA " + this.gpa;
    }

    @Override
    public Object clone() {
        return new Student(this);
    }
}
