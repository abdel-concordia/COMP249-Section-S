package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        MyInterface1 obj1 = new MyClass();
        MyInterface1 obj2 = new MyClass2();

        MyInterface1[] objs = new MyInterface1[2];
        objs[0] = new MyClass();
        objs[1] = new MyClass2();

        for (MyInterface1 obj : objs) {
            obj.f();
        }
    }

}
