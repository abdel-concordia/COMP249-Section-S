package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        Interface1 obj1 = new Interface1() { // obj is referencing an object out of an anonymous class that implements Interface1
            @Override
            public void f() {

            }
        };

    }

}

interface Interface1 {

    void f();
}

// three ways to implement an interface
// 1. Named class
// 2. Anonymous class
// 3. Lambda expression (not covered in COMP 249) ->
