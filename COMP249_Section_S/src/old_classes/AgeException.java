package old_classes;

public class AgeException extends Exception {

    private final int MIN_AGE = 0;
    private final int MAX_AGE = 150;

    public AgeException(String message) {
        super(message);
    }

    public int getMinAge() {
        return this.MIN_AGE;
    }

    public int getMaxAge() {
        return this.MAX_AGE;
    }
}
