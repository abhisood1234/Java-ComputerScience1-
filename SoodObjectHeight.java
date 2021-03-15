import java.util.Scanner;

public class SoodObjectHeight
{
    public static void main(String[]args)
    {
        double time;
        double ObjectHeight;
        Scanner timeinput = new Scanner(System.in);
        
        System.out.println("Enter a time less than 4.5 seconds");
        time = timeinput.nextInt();
        
        ObjectHeight = 100-((time*time)* 4.9);
        System.out.print("The height of the object is: "+ ObjectHeight+" meters");
    }
}