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
    private String firstName;
    private String lastName;
    
    //If needed, multiple constructors can be added, but I didn't see a reason right now.
    public PersonalCustomer(int accountNumber,String accountName, String firstName, String lastName){
        super(accountNumber, accountName);
        this.lastName = lastName;
        this.firstName = firstName;
    }   
    
    //Getters and setters for FirstName and LastName were split so each variable can be called separately
    public String getName(){
        return "first name: " +firstName +" last name: " +lastName;
    }
    public int getAccountNumber(){
        return super.accountNumber;
    }
    
    public void setFirstName(String FirstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String LastName){
        this.lastName = lastName;
    }

}

