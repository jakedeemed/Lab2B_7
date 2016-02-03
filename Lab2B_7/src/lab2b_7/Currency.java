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
public class Currency{
    int  bills;
    
    private void setRequest(double in){
         Atm a = new Atm();
         bills = a.getRequest();
    }
    
    public int currency(){
        return bills;
    }

}
