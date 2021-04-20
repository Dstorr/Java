
package surprisemeal;

//Declarations 
import java.util.Scanner;
import java.util.Random;

public class SurpriseMeal {

    
    public static void main(String[] args) {
        
        //Scanner and Random
        Scanner kb = new Scanner(System.in);
        Random rnd = new Random();
        
        //Title and Line
        System.out.println("===============================================");
        System.out.println("                 Main Course                   ");
        System.out.println("===============================================");
        
        //Description
        System.out.println("Description: ");
        System.out.println("In our main course you'll be randomly choosen");
        System.out.println("to get either Hamburger, Hot Dog or Drum Stick");
        
        
        //ArrayList for mainCourse with the Hamburger, Hot Dog & Chicken drumsticks elements in it 
        String [] mainCourse = {"Hamburger", "Hot Dog", "Chicken Drumstick"};
        
        //Random number for mainCourse
        int num1 = rnd.nextInt(3);
                    
        //Main Course Print statement and Line
        System.out.println("===============================================");
        System.out.println("Your surprise meal is a " + mainCourse[num1] + " with fries.");
        System.out.println("===============================================");
        
       
    }
    
}
