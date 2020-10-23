/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author morgan
 */
public class BankCustomer {
    private double balance;
    private String username;
    
    public String getUsername() {
        return this.username;
    }
    
    public String setUsername(String username) {
        this.username = username;
        return this.username;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double setBalance(double balance) {
        this.balance = balance;
        return this.balance;
    }
    
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
    
    public double withdraw(double amount) throws Exception {
        if (this.balance - amount < 0) {
            System.out.println("You do not have the funds to withdraw that amount.");
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;
    }
    
    public double getPercentage(double percentage) {
        return this.balance / 100 * percentage;
    }
 
}
