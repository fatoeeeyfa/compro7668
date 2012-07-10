package th.ac.nu.students.u54347668.compro.ch02;
import java.util.Scanner;

public class Volume3 {
   public static void main (String []args){
    Scanner in = new Scanner (System.in);
    
    System.out.print ("Please enter the price for a six-pack :");
    double packPrice = in.nextDouble ();
    
    final double LITER_PER_OUNCE = 0.0296;
    final double CAN_VOLUME= 12*LITER_PER_OUNCE;
    final double PACK_VOLUME = 6*CAN_VOLUME;
    
    double pricePerLiter = packPrice / PACK_VOLUME;
    
    System.out.printf("Price per liter : %8.2f",pricePerLiter);
    System.out.println();

    }
     
}
