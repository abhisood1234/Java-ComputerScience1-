import java.text.NumberFormat;
import java.util.Scanner;

public class SoodDiscountProgram
{
    public static void main(String [] args)
    {
        double price;
        double rate;
        double discountedPrice;
        double finalPrice;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the purchase price: ");
        price = input.nextDouble();
        
        System.out.println("Enter the discount rate, using decimals: ");
        rate = input.nextDouble();
        
        discountedPrice = price * rate;
        
        finalPrice = price - discountedPrice;
        
        System.out.print("Discounted Price: "+ money.format(finalPrice));
        
    }
}