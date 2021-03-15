import java.util.Scanner;
import java.text.NumberFormat;

public class SoodGradeAverage
{
    public static void main(String[]args)
    {
        int quarter1grade;
        int quarter2grade;
        int quarter3grade;
        int quarter4grade;
        double yearlyAverage;
        
        
        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        
        System.out.println("Enter the grade for Q1: ");
        quarter1grade = input.nextInt();
        System.out.println("Enter the grade for Q2: ");
        quarter2grade = input.nextInt();
        System.out.println("Enter the grade for Q3: ");
        quarter3grade = input.nextInt();
        System.out.println("Enter the grade for Q4: ");
        quarter4grade = input.nextInt();
        
        yearlyAverage = quarter1grade;
        yearlyAverage += quarter2grade+ quarter3grade + quarter4grade;
        yearlyAverage /= 400;
        
        
        System.out.print("Your yearly average is "+ percent.format(yearlyAverage));
        
        
    }
}
