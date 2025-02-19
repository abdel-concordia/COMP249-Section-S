package comp249_section_s;

import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        /*
        // Writing to a text file
        // Create PrintWriter object
        PrintWriter fos = null;
        try {
            fos = new PrintWriter(new FileOutputStream("data.txt"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot create the file for output.");
            System.exit(0);
        }

        // Write to the file
        fos.print("Hello");
        fos.println(" World");
        fos.print("Hi");

        // Close the file
        fos.close();
         */
        // Reading from a text file
        // Open the file
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("data.txt"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Could not open the file for input.");
        }

        // Read from file
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
        // Close file
        sc.close();
    }
}
