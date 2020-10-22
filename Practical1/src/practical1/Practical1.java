// Exercise 2
package practical1;

import java.io.*;
import java.util.*; 

// i hate beans too mcuh

/**
 *
 * @author Harrison + Austin
 */
public class Practical1 {

    /**
     * @param args the command line arguments
     */
    public static void PrintStars(int i) 
    {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<Integer>();
        
        try {
            File myObj = new File("C:\\Users\\Helen\\Documents\\NetBeansProjects\\ESD-Group-3\\Practical1\\src\\practical1\\grades.txt");
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()) {
                intList.add(Integer.parseInt(myReader.nextLine()));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        int size = intList.size();
        int cat_counts[] = new int[10];
        for(int i = 0; i < size; i++) {
            int temp = intList.get(i);
            if(temp < 11) {
                cat_counts[0]++;
            }
            else if (temp < 21) {
                cat_counts[1]++;
            }
            else if (temp < 31) {
                cat_counts[2]++;
            }
            else if (temp < 41) {
                cat_counts[3]++;
            }
            else if (temp < 51) {
                cat_counts[4]++;
            }
            else if (temp < 61) {
                cat_counts[5]++;
            }
            else if (temp < 71) {
                cat_counts[6]++;
            }
            else if (temp < 81) {
                cat_counts[7]++;
            }
            else if (temp < 91) {
                cat_counts[8]++;
            }
            else {
                cat_counts[9]++;
            }
        }
        
        System.out.print(" 1 - 10  | ");
        PrintStars(cat_counts[0]);
        System.out.print("11 - 20  | ");
        PrintStars(cat_counts[1]);
        System.out.print("21 - 30  | ");
        PrintStars(cat_counts[2]);
        System.out.print("31 - 40  | ");
        PrintStars(cat_counts[3]);
        System.out.print("41 - 50  | ");
        PrintStars(cat_counts[4]);
        System.out.print("51 - 60  | ");
        PrintStars(cat_counts[5]);
        System.out.print("61 - 70  | ");
        PrintStars(cat_counts[6]);
        System.out.print("71 - 80  | ");
        PrintStars(cat_counts[7]);
        System.out.print("81 - 90  | ");
        PrintStars(cat_counts[8]);
        System.out.print("91 - 100 | ");
        PrintStars(cat_counts[9]);

        
    }
    
}
