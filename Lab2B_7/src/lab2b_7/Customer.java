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
    private String customerName;
    private String customerAddress;
    
    //there is only one constructor for Customer, but more can be added.
    public Customer(String customerName, String customerAddress ){
        super();
        this.customerName = customerName;
        this.customerAddress = customerAddress;   
    }
    
    public String getInfo(){
        return "Customer Name: "+this.customerName+ ", Customer address: "+this.customerAddress;
    }
    
}
