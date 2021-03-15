import java.util.Scanner;
public class SoodDivAndMod
{
    public static void main(String[]args)
    {
        int num1;
        int num2;
        double div1;
        double mod1;
        double div2;
        double mod2;
        
        Scanner numberinput = new Scanner(System.in);
        
        System.out.println("Enter your first number");
        num1 = numberinput.nextInt();
        
        System.out.println("Enter your second number");
        num2 = numberinput.nextInt();
        
        div1 = num1/num2;
        mod1 = num1%num2;
        div2 = num2/num1;
        mod2 = num2%num1;
        System.out.println(num1+" / "+ num2+" = "+div1);
        System.out.println(num1+" % "+ num2+" = "+mod2);
        System.out.println(num2+" / "+ num1+" = "+div2);
        System.out.print(num2+" / "+ num1+" = "+mod2);
    }
}