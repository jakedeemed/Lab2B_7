/*
Help! You're trapped in the second person and can't escape!
Help you! Help you!!
 */
package lab2b_7;

/**
 *
 * @author Max Kosabutsi
 */
public class PersonalCustomer extends Customer{
    private int age;
    
    //If needed, multiple constructors can be added, but I didn't see a reason right now.
    public PersonalCustomer(String customerName, String customerAddress, int age){
        super(customerName, customerAddress);
        this.age = age;
    }   
    
    //Getters and setters for FirstName and LastName were split so each variable can be called separately
    public String getPersonalCustInfo(){
        return super.getInfo()+", age: "+this.age;
    }

}

