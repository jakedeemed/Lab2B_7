/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_7;

/**
 *
 * @author jakedotts
 */
public class Account {
    
    private double accountBalance;
    private double accountNumber;
    
    public Account(){
        
    }
    public Account(double accountBalance, double accountNumber){
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }
    
    public String getAccountInfo(){
        return "/n Account Number: "+accountNumber+"/n Account Balance: "+accountBalance;
    }
}
