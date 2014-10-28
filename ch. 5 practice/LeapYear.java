import java.util.Scanner;
public class LeapYear
{
    public static boolean isLeapYear(int year){
       return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter a year: ");
       int year = in.nextInt();
       
       if (LeapYear.isLeapYear(year))
       {
           System.out.println(year + " is a leap year. ");
       }
       else
       {
           System.out.println(year + " is not a leap year. ");
       }
    }
}