import java.util.Scanner;

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter a width: ");
        
        int width = in.nextInt();
        for(int index = 1; index <= width; index++)
        {
            String a = "*";
            String space = " ";
            for(int s = 0; s <= (width - index); s++)
            {
                System.out.print(space);
            }
            for(int i = 1; i <= (index*2 - 1); i++)
            {
                System.out.print(a);
            }
            System.out.print("\n");  

        }
        for(int index = width; index <= width && index > 0; index--)
        {
            String a = "*";
            String space = " ";
            for(int s = 0; s <= (width-index); s++)
            {
                System.out.print(space);
            }
            for(int i = 1; i <= (index*2-1); i++)
            {
                System.out.print(a);
            }
            System.out.print("\n"); 
        }
    }

}
