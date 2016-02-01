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
    private static String businessName;
    
    //as always, more constructors can be added.
    public CommercialCustomer(int Accnu,String Accna, String BN){
        super(AccountNumber, AccountName);
        businessName = BN;
    }
    
    //in order to please our dark lord JAVA, I have committed many attrocities. Stack have mercy on my soul.
    public static int getAccNumber(){
        return AccountNumber;
    }
}
