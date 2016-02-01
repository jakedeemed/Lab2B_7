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
public class CheckingAccount {
    
    private double checkingBalance = 0.0;
    
    public CheckingAccount(){
        
    }
    
    public double getCheckingBalance(){
        return checkingBalance;
    }
    
    public void setCheckingBalance(double newCheckingBalance){
        checkingBalance = newCheckingBalance;
    }
}
