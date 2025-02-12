package comp249_section_s;

public abstract class Animal {

    protected String color;

    public Animal(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void move();

    //public abstract int f();
    // private abstract int g(double x);
}
