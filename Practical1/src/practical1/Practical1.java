// Exercise 2
package practical1;

import java.io.*;
import java.util.Scanner;

public class Practical1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try {
            File myObj = new File("grades.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
    
}
