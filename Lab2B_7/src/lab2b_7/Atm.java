/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_7;


/**
 *
 * @author EdgarJC
 */
public class Atm {
    Currency c = new Currency();
    Lab2B_7 m = new Lab2B_7();
    
   
    private void setRequest(double currency){
        m.userInput = currency;
    }
    
    double getRequest(){
        return m.userInput;
    }  

}
