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
public abstract class Customer {
    /* changed these variables to protected since private variables are not inherited by subclasses.
       Static keyword fixes an error with the super keyword in PersonalCustomer, not really sure why.
    */
    protected static int AccountNumber;
    protected static String AccountName;
    
    //there is only one constructor for Customer, but more can be added.
    public Customer(int AccNu, String AccNa ){
        super();
        AccNu = AccountNumber;
        AccNa = AccountName;   
    }
    
    
}
