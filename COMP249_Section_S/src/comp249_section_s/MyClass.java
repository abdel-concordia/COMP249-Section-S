package comp249_section_s;

public class MyClass extends Object implements MyInterface1 {

    @Override
    public void method1() {
        System.out.println("This is method 1 in MyClass");
    }
}

abstract class A {

    abstract void f();
}

abstract class B extends A implements MyInterface1 {

    @Override
    public void method1() {

    }
}

class C extends B {

}
