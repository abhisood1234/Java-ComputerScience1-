import java.util.Scanner;
import java.text.NumberFormat;

public class SoodPrinting
{
    public static void main(String[]args)
    {
        int copynumber;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of copies to be printed: ");
        copynumber = input.nextInt();
        
        if(copynumber>0 && copynumber < 99)
        {
            System.out.println("Price per copy is: " + money.format(.30));
            System.out.print("Total cost is: "+ money.format(.30*copynumber));
        }
        
        else if(copynumber>100 && copynumber < 499)
        {
            System.out.println("Price per copy is: " + money.format(.28));
            System.out.print("Total cost is: "+ money.format(.28*copynumber));
        }
        
        else if(copynumber>500 && copynumber < 749)
        {
            System.out.println("Price per copy is: " + money.format(.27));
            System.out.print("Total cost is: "+ money.format(.27*copynumber));
        }
        
        else if(copynumber>750 && copynumber < 1000)
        {
            System.out.println("Price per copy is: " + money.format(.26));
            System.out.print("Total cost is: "+ money.format(.26*copynumber));
        }
        
        else
        {
            System.out.println("Price per copy is: " + money.format(.25));
            System.out.print("Total cost is: "+ money.format(.25*copynumber));
        }
    }
}