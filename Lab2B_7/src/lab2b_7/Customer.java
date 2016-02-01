/*
I broke the fourth wall in my apartment
Now all I can hear is a shitty laugh track whenever I do something
I hope I don't get cancelled.
 */
package lab2b_7;

/**
 *
 * @author Max Kosabutski
 */
//made Customer abstract since it's only here to presever muh hierarchy.
public class Customer {
    /* changed these variables to protected since private variables are not inherited by subclasses.
       
    */
    protected int accountNumber;
    protected String accountName;
    
    //there is only one constructor for Customer, but more can be added.
    public Customer(int accountNumber, String accountName ){
        super();
        this.accountNumber = accountNumber;
        this.accountName = accountName;   
    }
    
    
}
