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
public class SavingsAccount {
    
    private double savingsBalance = 0.0;
    
    public SavingsAccount(){
    }
    
    public void setSavingsBalance(double newSavingsBalance){
        savingsBalance = newSavingsBalance;
    }
    
    public double getSavingsBalance(){
        return savingsBalance;
    }
    
}
