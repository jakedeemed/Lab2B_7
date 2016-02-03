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
public class PersonalAccount extends Account{
    private String fName;
    private String lName;
    
    public PersonalAccount(){
        
    }
    public PersonalAccount(String fName, String lName, double accountBalance, double accountNumber){
        super(accountBalance, accountNumber);
        this.fName = fName;
        this.lName = lName;
    }

    public String getBusinessInfo(){
        return "Customer Name: "+this.fName+" "+this.lName+super.getAccountInfo();
    }
}
