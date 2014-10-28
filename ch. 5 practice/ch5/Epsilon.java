package ch5;

import java.util.Scanner;

/**
 * Write a description of class Epsilon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{

    public static void main(String[] args)
    {
        final double EPSILON = 1e-14;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double value = in.nextDouble();
        
        String magnitude = "";
        if(Math.abs(value) < 1.0)
        {
            magnitude = "small";
        }
        else if(Math.abs(value) > 1000000.0)
        {
            magnitude = "large";
        }
        
        if(Math.abs(value - 0) < EPSILON)
        {
            System.out.println("Value is zero." + magnitude);
        }
        else if(value > 0)
        {
            System.out.println("Value is posative."+ magnitude);
        }
        else
        {
            System.out.println("Value is negative."+ magnitude);
        }
        
    }

}
