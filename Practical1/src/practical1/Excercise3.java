/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Harrison
 */
public class Excercise3 {

    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static void addInterest(List<BankCustomer> customers) {
        for(int i = 0; i < customers.size(); i++) {
            customers.get(i).deposit(customers.get(i).getPercentage(3));
        }
    }
    
    public static void menu(BankCustomer user, Scanner myScan) throws Exception {
        System.out.println("Your balance is: £" + user.getBalance());
        System.out.println("What would you like to do?");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Exit");
        int option = myScan.nextInt();
        if (option == 1) {
            System.out.println("How much would you like to deposit? (E.g. 12.50)");
            double amount = myScan.nextDouble();
            System.out.println("Your updated balance is now: £" + user.deposit(amount));
        } else if (option == 2) {
            System.out.println("How much would you like to withdraw? (E.g. 12.50)");
            double amount = myScan.nextDouble();
            System.out.println("Your updated balance is now: £" + user.withdraw(amount));
        } else if (option == 3) {
            System.out.println("Goodbye");
            System.exit(0);
        }
        menu(user, myScan);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner myScan = new Scanner(System.in);
        
        List<BankCustomer> customers = new ArrayList<>();
        
        // Randomise 10 accounts
        for(int i = 0; i < 10; i++) {
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int) 
                  (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            
            String generatedString = buffer.toString();

            BankCustomer tempCustomer = new BankCustomer();
            tempCustomer.setUsername(generatedString);
            Random rand = new Random();
            double balance = Double.parseDouble(df2.format(0.00 + (100.00 - 0.00) * rand.nextDouble()));
            tempCustomer.setBalance(balance);
            customers.add(tempCustomer);
            System.out.println("Username: " + generatedString + " | Balance: £" + balance);
        }
        
        addInterest(customers);
        
        System.out.println("\n -- Adding Interest -- \n");
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Username: " + customers.get(i).getUsername() + " | Balance: £" + customers.get(i).getBalance());
        }
        
        System.out.println("Enter your username: ");
        String username = myScan.nextLine();
        BankCustomer user = new BankCustomer();
        for(int i = 0; i < 10; i++) {
            if (customers.get(i).getUsername().equals(username)) {
                user = customers.get(i);
            }
        }
        
        menu(user, myScan);
    }
    
}
