import java.util.Scanner;

public class SoodWarmUpScanner
{
    public static void main(String[]args)
    {
      int length;
      int width;
      int area;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("What is the length?");
      length = input.nextInt();
      
      System.out.println("What is the width?");
      width = input.nextInt();
      
      area = length*width;
      System.out.print("The area is "+area);
      
      
      
      
    }
}
    
