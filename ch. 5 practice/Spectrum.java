kl; import java.util.Scanner;

public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a wavelength value ex. 0.0001: ");
        double string = in.nextDouble();
   
        if (string >= Math.pow(10,-1))
        {
            System.out.println("Type: Radio Waves - Frequency(Hz): <3 x 10^9");
        }
        else if (string >= Math.pow(10,-3) && string <= Math.pow(10,-1))
        {
            System.out.println("Type: Microwaves - Frequency(Hz): 3 x 10^9 to 3 x 10^11");        
        }
        else if (string >= 7 * Math.pow(10,-7) && string <= Math.pow(10,-3))
        {
            System.out.println("Type: Infrared - Frequency(Hz): 3 x 10^11 to 4 x 10^14");        
        }
        else if (string >= 4 * Math.pow(10,-7) && string <= 7 * Math.pow(10,-7))
        {
            System.out.println("Type: Visible Light - Frequency(Hz): 4 x 10^14 to 7.5 x 10^14");        
        }
        else if (string >= Math.pow(10,-8) && string <= 4 * Math.pow(10,-7))
        {
            System.out.println("Type: Visible Light - Frequency(Hz): 3 x 10^14 to 3 x 10^11");        
        }
        else if (string >= Math.pow(10,-11) && string <= 4 * Math.pow(10,-8))
        {
            System.out.println("Type: X-rays - Frequency(Hz): 3 x 10^16 to 3 x 10^19");        
        }
        else if (string >= Math.pow(10,-8) && string <= 4 * Math.pow(10,-7))
        {
            System.out.println("Type: Visible Light - Frequency(Hz): 3 x 10^14 to 3 x 10^11");        
        }
        else
        {
            System.out.println("Type: Gamma rays - Frequency(Hz): > 3 x 10^9");        
        }
    }
}

    