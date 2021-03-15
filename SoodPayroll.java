public class SoodPayroll
{
    public static void main(String[]args)
    {
        double hoursWorked = 40;
        double payRate = 10;
        double taxRate = .1;
        double payAmount = payRate * hoursWorked;
        double taxAmount = payAmount * taxRate;
        double grossPay = payAmount - taxAmount;
        System.out.print("Hours Worked: "+hoursWorked+"\n");
        System.out.print("Pay Amount: "+payAmount+"\n");
        System.out.print("Tax Amount: "+taxAmount+"\n");
        System.out.print("Gross Pay: "+grossPay);
        
        
    }
}