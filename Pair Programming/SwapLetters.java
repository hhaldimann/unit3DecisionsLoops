import java.util.Random;
import java.util.Scanner;
public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        
        String word = in.nextLine();
        int num = word.length();
        for(int index = 0; index < num; index++)
        {
            Random rn = new Random();          
            int rnd = rn.nextInt(num- 2) + 1;
            String first = "";
            if(rnd != 0)
            {
                first = word.substring(0,rnd);
            }
            else
            {
                first = word.substring(0,1);
            }
            String i = word.substring(rnd, rnd + 1);
            int rnd2 = rn.nextInt(num - rnd - 1)  + rnd + 1;
            String middle = word.substring(rnd +  1, rnd2);
            String j = word.substring(rnd2, rnd2 + 1);
            String last = word.substring(rnd2 + 1);
            System.out.println(first + j + middle + i + last);
            
        }
    }
}
