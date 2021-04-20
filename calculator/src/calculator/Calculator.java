
package calculator;

public class Calculator {
    public static int plus(int a, int b) 
    {
        return a + b;
    }

    public static int minus(int a, int b) 
    {
        return a - b;
    }

    public static int multiply(int a, int b) 
    {    
        return a * b;
    }

    public static double divide(int a, int b) 
    {    
        return ((double)a/(double)b);
    }

    public static double percent(int a, int b) 
    {
        double c = ((double)b/(double)a)*100;
        return c;
    }

    public static void main(String[] args) 
    {
        
    }
}
