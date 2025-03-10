package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, 4};

        int sum = sumPositive(arr, arr.length - 1);

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
        if (index == numbers.length - 1) { // we only have one element remaining
            return numbers[index]; // return the value of that remaining element
        } // Recursive call
        else {
            return numbers[index] + sumArray(numbers, index + 1); // return the actual element + the sum of the remaining elements
        }
    }

    public static int sumArray(int[] numbers) {
        // Base case
        if (numbers.length == 1) {
            return numbers[0];
        } // Recursive call
        else {
            int[] newArray = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                newArray[i] = numbers[i + 1];
            }
            return numbers[0] + sumArray(newArray);
        }
    }

    public static int countPositive(int[] numbers, int index) {
        // Base case
        if (index == 0) {
            return numbers[0] >= 0 ? 1 : 0;
        } // Recursive call
        else {
            if (numbers[index] >= 0) {
                return 1 + countPositive(numbers, index - 1);
            } else {
                return countPositive(numbers, index - 1);
            }
        }
    }

    public static int sumPositive(int[] numbers, int index) {
        // Base case
        if (index == 0) {
            if (numbers[0] >= 0) {
                return numbers[0];
            } else {
                return 0;
            }
        } // Recursive call
        else {
            if (numbers[index] >= 0) {
                return numbers[index] + sumPositive(numbers, index - 1);
            } else {
                return sumPositive(numbers, index - 1);
            }
        }
    }

}
