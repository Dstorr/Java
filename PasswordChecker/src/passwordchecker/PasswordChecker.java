
package passwordchecker;

import java.util.Scanner;
public class PasswordChecker {


    public static void main(String[] args) {
   
        //Title
        System.out.println("====================================");
        System.out.println("         Password Checker           ");
        System.out.println("====================================");
        
        //Scanner
        Scanner kb = new Scanner(System.in);
        
        //Description 
        System.out.println("Must be at least 8 characters long.");
        System.out.println("Must not contain any spaces.");
        System.out.println("Must begin with an uppercase letter G");
        
        //Char 
        String passWord;
       
         //Print Statement for input needed
          System.out.print("Enter Password: ");
           passWord = kb.nextLine();
        
        
           //If statements
            if (passWord.length() <= 8) 
             {
                System.out.println("Your password must be 8 characters long");
             }
            if (passWord.startsWith("G") == false) 
             {
                System.out.println("Your password, must begin with a capital G.");
             }
            if (passWord.contains(" ")) 
             {
                System.out.println("Your password must not contain any spaces");
             }
          
          System.out.println("Your password is valid");
    }
}
