import java.util.Scanner;

public class FindMax
{

    /** Finds the maximum value in the specified series of numbers
    */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to exit)");
        
        double currentMax = in.nextDouble();
        
        while( in.hasNextDouble() )
        {
            double value = in.nextDouble();
            if( value > currentMax )
            {
                currentMax = value;
            }
        
        }
        System.out.println("Maximum value: " + currentMax);
    }

}
