import java.util.Scanner;

public class CountMatches
{
    /** Counts the number of spaces " " in a string
    */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = in.nextLine();
        
        int spaces = 0;
        
        for (int index = 0; index < input.length(); index ++ )
        { 
            char ch = input.charAt(index);
            if ( ch == ' ' )
            {
                spaces++;
            }
         
        }
        System.out.println("Number of spaces in a string: " + spaces);
    }

}
