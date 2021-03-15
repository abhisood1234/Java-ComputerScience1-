import java.util.Scanner;

public class SoodSurfsUp
{
    public static void main(String[]args)
    {
    //part 1
     /*   
        double waveHeight;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the waves?");
        waveHeight = input.nextDouble();
        
        if(waveHeight>6)
        {
            System.out.println("Great day for surfing!");
        }
        
        
    //part 2
        
        double waveHeight;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the waves?");
        waveHeight = input.nextDouble();
        
        if(waveHeight>6)
        {
            System.out.println("Great day for surfing!");
        }
        else if(waveHeight<6)
        {
            System.out.println("Go body boarding!");
        }
    */    
    //part 3
    
        double waveHeight;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the waves?");
        waveHeight = input.nextDouble();
        
        if(waveHeight>6)
        {
            System.out.println("Great day for surfing!");
        }
        
        else if(waveHeight < 6 && waveHeight > 3)
        {
            System.out.println("Go body boarding!");
        }
        
        else if(waveHeight > 0 && waveHeight < 3)
        {
            System.out.println("Go for a swim");
        }
        
        else
        {
            System.out.println("Whoa! What kind of surf is that?");
        
        }
        
        
    }
}