package old_classes;

import old_classes.Animal;

public class Fish extends Animal {

    public Fish(String color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("I swim");
    }
}
