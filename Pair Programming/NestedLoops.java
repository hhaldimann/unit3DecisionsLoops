public class NestedLoops
{

    /**
     * Default constructor for objects of class NestedLoops
     */
    public static void main(String[] args)
    {
        for(int value = 1; value < 3; value++)
        {
            for(int second = 1; second < 5; second++)
            {
                System.out.println(value + " "+ second);
            }
        }
    }
    
    public static void main2(String[] args)
    {
        int value = 1;
        while( value < 3)
        {
            int second = 1;
            while( second < 5)
            {
                System.out.println(value + " " + second);
                second++;
            }
            value ++;
        }
    }
    public static void main3(String[] args)
    {
        int value = 1;
        
        do
        {
            int second = 1;
            
            do
            {
                System.out.println(value + " " + second);
                second ++;
            }
            while( second < 5);
            value++;
        }
        while( value < 3);
    }
    }

