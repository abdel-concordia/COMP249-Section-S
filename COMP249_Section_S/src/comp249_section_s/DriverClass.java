package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        //Address address1 = new Address(1445, "Maisonneuve West", "Montreal");
        //Student st1 = new Student("John", 10, new Address(1445, "Maisonneuve West", "Montreal"), "112233", 0.0);
        A a = new A();
        B b = new B();

        System.out.println(a.x);
        System.out.println(b.x);

    }

}

class A {

    static int x = 0;

    public A() {
        x++;
    }
}

class B extends A {

    public B() {
        x++;
    }
}
