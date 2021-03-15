import java.util.Scanner;

public class SoodPizzaCost
{
 public static void main(String[]args)
 {
     
     double LaborCost = .75;
     double RentCost = 1;
     double Diameter;
     Scanner DiameterInput = new Scanner(System.in);
     
     System.out.println("Enter the diamter of the pizza in inches: ");
     Diameter = DiameterInput.nextInt(); 
     
     double PizzaCost = (LaborCost + RentCost + (.05 * Diameter * Diameter));
     System.out.print("The cost of making the pizza is: $" + PizzaCost);
     
     
 }   
 
}