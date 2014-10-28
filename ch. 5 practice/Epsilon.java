import java.util.Scanner;
public class Epsilon
{
    public static void main(String[] args)
    {
        final double EPSILON = 1e-14;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a floating point number: ");
        double value = in.nextDouble();
        
        String magnitude = "";
        if(Math.abs(value) < 1.0)
        {
            magnitude = "small";
        }
        else if(Math.abs(value) > 1000000)
        { 
            magnitude = "large";
        }
        
        if(Math.abs(value - 0) < EPSILON)
        {
            System.out.println("Value is zero.");
        }
        else if(value > 0)
        {
            System.out.println("Value is a " + magnitude + " positive number.");
        }
        else
        {   
            System.out.println("Value is a " + magnitude + " negative number.");
        }
    }
}
