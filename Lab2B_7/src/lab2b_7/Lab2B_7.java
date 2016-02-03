
package lab2b_7;

import java.util.Scanner;

/**
 *
 * @author EdgarJC
 */
public class Lab2B_7 {
    public static double userInput;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Atm a = new Atm();  
        String custType;
        
        //UserI Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello welcome to 'Da Banq' - your neighborhood "
                + "friendly money teller");
        System.out.println("Looks like your first time here, we need some info to start.");
        System.out.println("What kind of customer are you?");
        System.out.println("P for personal and C for commercial");
        custType = sc.nextLine();
        if(custType.equalsIgnoreCase("P")){
            System.out.println("Welcome personal cusomter!");
            System.out.println("Please enter your name: ");
            
        }
        else if(custType.equalsIgnoreCase("C")){
            System.out.println("Welcome commercial customer!");
            
        }else{
            System.out.println("Did not enter the right choice,  DA BANQ SAYS GOODBYE!");
        }
        
    
        System.out.println("How much money do you need?");
        userInput = sc.nextDouble();
        //Prints out the amount
        System.out.println(a.getRequest());
       
    }
    
}
