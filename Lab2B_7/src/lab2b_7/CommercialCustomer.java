/*
Is a fly without wings called a Walk?
Do vegetarians eat animal crackers?
If you try to fail and succeed, what have you really accomplished?
 */
package lab2b_7;

/**
 *
 * @author Max Kosabutski
 */
public class CommercialCustomer extends Customer {
    
    private int yearsInService;
    
    //as always, more constructors can be added.

    public CommercialCustomer(String customerName,String customerAddress, int yearsInService){
        super(customerName,customerAddress);
        this.yearsInService = yearsInService;
    }
    
    //in order to please our dark lord JAVA, I have committed many attrocities. Stack have mercy on my soul.
    public String getCommercialCustInfo(){
        return super.getInfo()+", years in service: "+this.yearsInService;
    }
}
