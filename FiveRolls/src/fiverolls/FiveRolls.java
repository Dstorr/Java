
package fiverolls;
//Declarations
import java.util.Scanner;
import java.util.Random;

public class FiveRolls {

    public static void main(String[] args) {
        
    //Title and Lines
    System.out.println("===========================================================");
    System.out.println("                      Five Rolls                           ");
    System.out.println("===========================================================");

    //Description
    System.out.println("The goal of this game is to roll an even number 3 times ");
    System.out.println("If you roll it less than three times you lose. Now let's begin");
    
    //Scanner and Random number
    Scanner kb = new Scanner(System.in);
    Random rnd = new Random();
    
    
    //Player's Username
    System.out.print("Choose your username:");
    String userName = kb.nextLine();
    
    //Dice Variables and Dice Roll random Code   
    // Even number variable
    int dice1 = rnd.nextInt(6) + 1;
    int dice2 = rnd.nextInt(6) + 1;
    int dice3 = rnd.nextInt(6) + 1;
    int dice4 = rnd.nextInt(6) + 1;
    int dice5 = rnd.nextInt(6) + 1;
    int even = 0;
    
    //If Statement for even numbers
    //If any number is divisible by 2 then it's even
    if (dice1 % 2 == 0) 
    {
        even++;
    }
    
    if (dice2 % 2 == 0) 
    {
        even++;
    }
    if (dice3 % 2 == 0) 
    {
        even++;
    }
    if (dice4 % 2 == 0) 
    {
        even++;
    }
    if(dice5 % 2 == 0) 
    {
        even++;
    }
    
    //Line
    System.out.println("===========================================================");
    
    //Print statement for Dice
    System.out.println(userName + " rolled: " + dice1 + " " + dice2 + " " + dice3 + " " + dice4 + " " + dice5);
    
    //Output of the number of even numbers.
    System.out.println("Total number of evens: " + even);
    
    //If statement for the amount of even numbers
    if ( even >= 3) 
    {
        System.out.println("You win");
    }
    else 
    {
        System.out.println("You lose");
    }
    
    //Line
    System.out.println("===========================================================");
   
   
    }
}
