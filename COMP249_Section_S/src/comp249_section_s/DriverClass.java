package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        int sum = sumDown(5);
        System.out.println(sum);
    }

    public static void countDown(int num) { // num is positive

        // Base case
        if (num == 0) {
            System.out.println(0);
        } // Recursive call
        else {
            System.out.println(num);
            countDown(num - 1);
        }
    }

    public static void countUp(int num) { // num is positive
        // Base case
        if (num == 0) {
            System.out.println(0);
        } else {
            // Recursive call
            countUp(num - 1);
            System.out.println(num);

        }
    }

    public static int sumDown(int num) { // num >= 0
        // Base case
        if (num == 0) {
            return 0;
        } else {
            // Recursive call
            return num + sumDown(num - 1);
        }
    }

    public static int sumArray(int[] numbers, int index) {
        // Base case

        // Recursive call
    }

    public static int sumArray(int[] numbers) {
        // Base case

        // Recursive call
    }
}
