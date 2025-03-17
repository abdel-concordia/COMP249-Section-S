package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
    }

    public void x() {

    }

    public static void y(int z) {
        int l = z;
    }
}

class A {

    private int x;

    private void f() {
    }

    private void k() {
        B b = new B();
    }

    class B {

        class C {

        }

        private static int y;

        private void g() {
            A.this.f();
        }

        private void f() {

        }
    }

}
