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
public class Checking {
    
    private double checkingBalance = 0.0;
    
    public Checking(){
        
    }
    
    public Checking(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    
    public double getCheckingBalance(){
        return checkingBalance;
    }
    
}
