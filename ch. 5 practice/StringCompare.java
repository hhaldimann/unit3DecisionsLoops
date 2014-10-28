
public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        int hello = word1.compareTo("aaa");
        if(hello > 0)
        {
            System.out.println(word1 + " is lexicographically greater than aaa.");
        }
        if (word1.equals(word2))
        {
            System.out.println(word1 + " is lexicographically equal to " + word2);
        }
        if(word1.compareTo(word2)< 0)
        {
            System.out.println(word1 + " is lexicographically smaller than " + word2);
        }
        if((word1.substring(0,3)).equals(word2.substring(0,3)))
        {
            System.out.println(word1 + " and " + word2 + " have the same three letter prefix.");
        }
    }
}
