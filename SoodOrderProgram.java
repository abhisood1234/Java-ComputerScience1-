/*User will enter the amount of sodas, fries and burgers they want. A pre-tax amount will displayed with a 6.5% tax being added on the pre-tax amount. 
Extra credit includes the amount given to pay and the change the store owes*/





//classes being imported
import java.util.Scanner;

import java.text.NumberFormat;

public class SoodOrderProgram
{
    public static void main(String[]args)
    {
        //Number formatting
        NumberFormat money = NumberFormat.getCurrencyInstance();
        //doubles
        double burgercost = 1.69;
        double friescost = 1.09;
        double sodascost = .99;
        double Total;
        double FinalTotal;
        double tax = .065;
        double moneytender;
        double change;
        
        //Integers
        int burgerNumber;
        int friesNumber;
        int sodaNumber;
        
        //User Input: Number of burgers, fries, soda
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of burgers: ");
        burgerNumber = input.nextInt();
        System.out.println("Enter the number of fries: ");
        friesNumber = input.nextInt();
        System.out.println("Enter the number of sodas: ");
        sodaNumber = input.nextInt();
        
        
        //Tax and total amounts
        Total = ((burgerNumber*burgercost)+(friescost*friesNumber)+(sodascost*sodaNumber));
        System.out.println("\nTotal before tax: "+money.format(Total));
        
        double taxamount = Total * tax;
        System.out.println("Tax: "+money.format(taxamount));
        
        FinalTotal = Total + taxamount;
        System.out.println("Final Total: "+money.format(FinalTotal));
        
        
        //Extra Credit: Amount tendered and change due
        System.out.println("\nEnter amount tendered: ");
        moneytender = input.nextInt();
        
        change = moneytender - FinalTotal;
        System.out.print("Change: "+money.format(change));
        
    }
}