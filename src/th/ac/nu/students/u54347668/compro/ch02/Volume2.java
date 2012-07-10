package th.ac.nu.students.u54347668.compro.ch02;
import java.util.Scanner;
/**
 This program prints the total volume of a number of bottles and cans
*/
public class Volume2 {
    
    public static void main (String []args){
        
        final double BOTTLE_VOLUME = 2;
        final double LITER_PER_OUNCE = 0.0296;
        final double CAN_VOLUME = 12 *  LITER_PER_OUNCE ;
        
        //Display prompt
        
        System.out.print("Please enter the number of bottles :");
        
        // Read number of bottles
        
        Scanner in = new Scanner(System.in);
        int bottles = in.nextInt ();
        
        //Start the computation of the total volume
        
        double totalVolume = bottles * BOTTLE_VOLUME;
        
        //Read number of cans
        
        System.out.print ("Please enter the number of cans :");
        int cans = in.nextInt();
        
        double additionalVolume = cans * CAN_VOLUME;
        
        //Update the total volume
        
        totalVolume = totalVolume + additionalVolume;
        
        System.out.print ("Tatal volume :");
        System.out.print (totalVolume);

    }
    
    
}
