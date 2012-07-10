package th.ac.nu.students.u54347668.compro.ch02;
import java.util.Scanner;

public class VendingMachine {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        
        System.out.print ("Enter bill value (1 = $1 bill, 5 = $5 bill , etc.)");
        int  billValue = in.nextInt ();
        System.out.print ("Enter item price in pennies :");
        int itemPrice = in.nextInt ();
        
        int amountDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
        int dollarCoins =  amountDue / PENNIES_PER_DOLLAR;
        amountDue = amountDue % PENNIES_PER_DOLLAR;
        int quarters = amountDue / PENNIES_PER_QUARTER;
        
        System.out.printf("Dollar coins : %6d",dollarCoins);
        System.out.println ();
        System.out.printf ("Quarters : %6d\n" ,quarters);
        System.out.println ();
        
        
        
    }
    
    
}
