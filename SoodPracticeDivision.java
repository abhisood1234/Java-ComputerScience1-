public class SoodPracticeDivision
{
    public static void main(String[]arg)
    {
        int num1 = 5;
        int num2 = 3;
        double doubleNum1 = 5;
        double doubleNum2 = 3;
        int intResult = num1/num2;
        System.out.println("The integer division result is: "+intResult);
        double doubleResult = doubleNum1 / doubleNum2;
        System.out.println("The double division result is: "+doubleResult);
        
        intResult = num1/num2;
        System.out.println("The intger modulus division result is: "+intResult);
        doubleResult = num1%num2;
        System.out.println("The double modulus division result is: "+doubleResult);
    }
}