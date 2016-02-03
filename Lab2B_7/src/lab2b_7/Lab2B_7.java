
package lab2b_7;

import java.util.Scanner;

/**
 *
 * @author EdgarJC
 */
public class Lab2B_7 {
    public static int userInput;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Atm a = new Atm();  
        String custType;
        
        String comCustName;
        String comCustAddress;
        String comCustPrefName;
        int comCustYears;
        double comCustAcctNum;
        double comCustChkAcctBal;
        double comCustSaveAcctBal;
        double comCustAcctBal;
        
        String perCustFname;
        String perCustLname;
        String perCustName;
        String perCustAddress;
        int perCustAge;
        double perCustAcctNum;
        double perCustChkAcctBal;
        double perCustSaveAcctBal;
        double perCustAcctBal;
        
        
        //UserI Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello welcome to 'Da Banq' - your neighborhood "
                + "friendly money teller");
        System.out.println("Looks like your first time here, we need some info to start.");
        System.out.println("What kind of customer are you?");
        System.out.println("P for personal and C for commercial");
        custType = sc.nextLine();
        if(custType.equalsIgnoreCase("P")){
            System.out.println("Welcome personal customer!");
            System.out.println("Please enter your name: ");
            perCustName = sc.nextLine();
            System.out.println("Please enter your address: ");
            perCustAddress = sc.nextLine();
            System.out.println("Please enter you age: ");
            perCustAge = sc.nextInt();
            PersonalCustomer p = new PersonalCustomer(perCustName, perCustAddress, perCustAge);
            
            System.out.println("Here is your info: "+p.getPersonalCustInfo());
            
            System.out.println("Now tell us your prefered name on the account.");
            perCustAcctNum = Math.random();
            System.out.print("first name: ");
            perCustFname = sc.next();
            System.out.print("last name: ");
            perCustLname = sc.next();
            System.out.println("Deposit to checking (e.g. 100.00): ");
            Checking chk = new Checking(sc.nextDouble());
            perCustChkAcctBal = chk.getCheckingBalance();
            System.out.println("Deposit to savings (e.g. 100.00): ");
            Savings save = new Savings(sc.nextDouble());
            perCustSaveAcctBal = save.getSavingsBalance();
            perCustAcctBal = perCustSaveAcctBal + perCustChkAcctBal;
            
            PersonalAccount Pa = new PersonalAccount(perCustFname, perCustLname, perCustAcctBal, perCustAcctNum);         
            
            System.out.println("here is your info: "+Pa.getAccountInfo());
            
        }
        else if(custType.equalsIgnoreCase("C")){
            System.out.println("Welcome commercial customer!");
            System.out.println("Please enter business name: ");
            comCustName = sc.nextLine();
            System.out.println("Please enter business address: ");
            comCustAddress = sc.nextLine();
            System.out.println("Please enter years in business: ");
            comCustYears = sc.nextInt();
            CommercialCustomer c = new CommercialCustomer(comCustName, comCustAddress, comCustYears);
            
            System.out.println("Here is your info: "+c.getCommercialCustInfo());
            
            System.out.println("Now tell us your prefered name on the account.");
            comCustAcctNum = Math.random();
            System.out.print("Desired business name: ");
            comCustPrefName = sc.nextLine();
            System.out.println("Deposit to checking (e.g. 100.00): ");
            Checking chk = new Checking(sc.nextDouble());
            comCustChkAcctBal = chk.getCheckingBalance();
            System.out.println("Deposit to savings (e.g. 100.00): ");
            Savings save = new Savings(sc.nextDouble());
            comCustSaveAcctBal = save.getSavingsBalance();
            comCustAcctBal = comCustSaveAcctBal + comCustChkAcctBal;
            
            CommercialAccount Ca = new CommercialAccount(comCustPrefName, comCustAcctBal, comCustAcctNum);
            
            System.out.println("here is your info: "+Ca.getAccountInfo());
            
            
        }else{
            System.out.println("Did not enter the right choice,  DA BANQ SAYS GOODBYE!");
        }
        
    
        System.out.println("How much money would you like to withdraw in increments of 20?");
        userInput = sc.nextInt();
        //Prints out the amount
        
        
        do{
            System.out.println("Amount Withdraw:" + a.getRequest());
        }   
        
       while(userInput % 20 != 0);
           System.out.println("Enter a multiple of 20!");
       
                    
        
        
       
    }
    
}
