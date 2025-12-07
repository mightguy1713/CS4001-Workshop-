import java.util.Scanner;
/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (Abhas Shakya)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        while (a <= 1) {
            System.out.print("Enter amount: ");
            double P = scan.nextDouble();
            System.out.print("Enter rate (8-12): ");
            double r = scan.nextDouble();
            System.out.print("Enter years: ");
            int t = scan.nextInt();
            double MonthlyRate = r / 1200;   
            int n = t * 12;             
            double A = P;
            int i = 1;
            while (i <= n) {
                A = A + (A * MonthlyRate);    
                i++;
            }
            double fee = A * 0.005;     
            double finalAmount = A - fee;
            System.out.println("---Fixed Deposit Result---");
            System.out.println("Final Amount = Rs" + finalAmount);
            System.out.println("Fee = Rs" + fee);
            System.out.println("Maturity Before Fee = Rs" + A );
            break;
        }
    }
}