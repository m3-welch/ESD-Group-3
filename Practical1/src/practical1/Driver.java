/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Driver {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter side 1");
        triangle.setSide1(Double.parseDouble(myScan.nextLine()));
        
        System.out.println("Enter side 2");
        triangle.setSide2(Double.parseDouble(myScan.nextLine()));
        
        System.out.println("Enter side 3");
        triangle.setSide3(Double.parseDouble(myScan.nextLine()));
        
        System.out.println(triangle.triangleType(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()));

    }
    
}
