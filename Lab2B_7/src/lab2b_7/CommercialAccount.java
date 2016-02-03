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
public class CommercialAccount extends Account{
    
    private String businessName;
    
    public CommercialAccount(){
        
    }
    public CommercialAccount(String businessName, double accountBalance, double accountNumber){
        super(accountBalance, accountNumber);
        this.businessName = businessName;
    }

    public String getBusinessInfo(){
        return "Business Name: "+this.businessName+super.getAccountInfo();
    }
    
}
