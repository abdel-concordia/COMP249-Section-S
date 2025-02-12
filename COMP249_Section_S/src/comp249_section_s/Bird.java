package comp249_section_s;

public class Bird extends Animal {

    private double wingspan;

    public Bird(String color, double wingspan) {
        super(color);
        this.wingspan = wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return this.wingspan;
    }

    @Override
    public void move() {
        System.out.println("I fly.");
    }

}
