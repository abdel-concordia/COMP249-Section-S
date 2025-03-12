package comp249_section_s;

public interface MyInterface1 {

    int number = 10;

    public void method1();

    default public void method2() {
        System.out.println("method2 in the interface");
    }

    void f();
}
