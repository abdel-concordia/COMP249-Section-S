package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        //A a = new A();
        //a.g();
        A b = new B();
        b.g();
    }

}

class A {

    public A() {
        f();
    }

    public void f() {
        System.out.println("f in A");
    }

    public void g() {
        f();
    }
}

class B extends A {

    @Override
    public void f() {
        System.out.println("f in B");
    }
}
