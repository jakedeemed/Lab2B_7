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
public class Savings {
    
    private double savingsBalance = 0.0;
    
    public Savings(){
        
    }
    
    public Savings(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    
    public double getSavingsBalance(){
        return savingsBalance;
    }
    
}
