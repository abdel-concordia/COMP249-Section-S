package comp249_section_s;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverClass {

    public static void main(String[] args) {

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

    }
}
