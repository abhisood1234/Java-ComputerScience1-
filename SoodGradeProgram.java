import java.util.Scanner;

public class SoodGradeProgram
{
    public static void main(String[]args)
    {
        double grade;
        
        char Agrade = 'A';
        char Bgrade = 'B';
        char Cgrade = 'C';
        char Dgrade = 'D';
        char Fgrade = 'F';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        grade = input.nextDouble();
        
        if(grade <= 100 && grade >= 90)
        {
            System.out.println("The corresponding letter grade is: "+ Agrade);
        }
        
        else if(grade <= 89 && grade >= 80)
        {
            System.out.println("The corresponding letter grade is: "+ Bgrade);
        }
        
        else if(grade <= 79 && grade >= 70)
        {
            System.out.println("The corresponding letter grade is: "+ Cgrade);
        }
        
        else if(grade <= 69 && grade >= 60)
        {
            System.out.println("The corresponding letter grade is: "+ Dgrade);
        }
        
        else
        {
            System.out.println("The corresponding letter grade is: "+ Fgrade);
        }
    }
}