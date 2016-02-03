
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
        
        //UserI Input
        Scanner sc = new Scanner(System.in);
    
        System.out.println("How much money do you need?");
        userInput = sc.nextDouble();
        //Prints out the amount
        System.out.println(a.getRequest());
       
    }
    
}
