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
    private static String FirstName;
    private static String LastName;
    
    //If needed, multiple constructors can be added, but I didn't see a reason right now.
    public PersonalCustomer(int Accnu,String Accna, String FN, String LN){
        super(AccountNumber, AccountName);
        LN = LastName;
        FN = FirstName;
    }   
    
    //Getters and setters for FirstName and LastName were split so each variable can be called separately
    public static String getFirstName(){
        return FirstName; 
    }
    
    public static String getLastName(){
        return LastName;
    }
    
    public static int getAccountNumber(){
        return AccountNumber;
    }
    
    public static void setFirstName(String FirstName){
        PersonalCustomer.FirstName = FirstName;
    }
    
    public static void setLastName(String LastName){
        PersonalCustomer.LastName = LastName;
    }

}

