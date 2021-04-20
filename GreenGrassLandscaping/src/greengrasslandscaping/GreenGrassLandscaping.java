
package greengrasslandscaping;

//Declarations
import java.util.Scanner;

public class GreenGrassLandscaping {


    public static void main(String[] args) {
        
        //Title and Line
        System.out.println("=============================");
        System.out.println("       GreenGrass242         ");
        System.out.println("=============================");
        
        //Scanner
        Scanner kb = new Scanner(System.in);
        
        //Math 1 metre = 100 cm
       //Inital Variables
        double metre = 1;
        double length = 0;
        double width = 0;
        double squareMetre = 0.0001;
                
        //Length Input question
        System.out.println("The length of your garden is: ");
        length = kb.nextDouble();
        
        //Width Input question
        System.out.println("The width of your garden is: ");
        width = kb.nextDouble();
        
        
        //More variables for code
        //Calculations
        double garden = length * width * metre;
        double perSquareMetre = garden * squareMetre;
        double lawnMowing = perSquareMetre * 0.50;
        double fencePainting = metre * 2;
        double Total = lawnMowing + fencePainting;
        
        
        //Output statements of Lawn Mowing, Fence Painting and Total
        System.out.println("=============================");
        System.out.println("Lawn mowing: $" + lawnMowing);
        System.out.println("Fence Painting: $" + fencePainting);
        System.out.println("Total Cost: $" + Total);
        System.out.println("=============================");

       
    }
    
}
