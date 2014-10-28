package ch5;



/**
 * Write a description of class word1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCompare
{

    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        int result = word1.compareTo(word2);
        if(result < 0)
        {
            System.out.println("Word1 is less than word2");
        }
        if(result > 0)
        {
            System.out.println("word2 is less than word1");
        }
        if(result == 0)
        {
            System.out.println("The two words are equal");
        }
        if((word1.substring(0,3)).equals(word2.substring(0,3)))
        {
            System.out.println("The first three letters are the same");
        }
    }
    }


