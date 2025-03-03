package comp249_section_s;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DriverClass {

    public static void main(String[] args) {

        /*
        int x = 10, y = 7, z = 25;

        // Open/create the file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot create/open the file.");
            System.exit(0);
        } catch (IOException ioex) {
            System.out.println("Cannot write to the file.");
            System.exit(0);
        }
        // Write from/to file
        try {
            oos.writeInt(x);
            oos.writeInt(y);
            oos.writeInt(z);
        } catch (IOException ioex) {
            System.out.println("Cannot write to the file.");
            System.exit(0);
        }

// close the file
        try {
            oos.close();
        } catch (IOException ioex) {
            System.out.println("Cannot close the output file.");
            System.exit(0);
        }

         */
        // Open the file
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("data.bin"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot open the file for read.");
            System.exit(0);
        } catch (IOException ioex) {
            System.out.println("Cannot read from file.");
            System.exit(0);
        }
        // Read from the file
        boolean flag = true;

        while (flag) {
            try {
                int num = ois.readInt();
                System.out.println(num);
            } catch (EOFException eofex) {
                flag = false;
                //System.out.println("No more numbers to read!!");
            } catch (IOException ioex) {
                System.out.println("Cannot read number.");
                System.exit(0);
            }
        }
        // CLose the file

        try {
            ois.close();
        } catch (IOException ioex) {
            System.out.println("Cannot close the input file.");
        }
    }
}
