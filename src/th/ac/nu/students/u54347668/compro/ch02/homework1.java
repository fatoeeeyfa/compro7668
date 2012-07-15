
package th.ac.nu.students.u54347668.compro.ch02;
import java.util.Scanner;
public class homework1 {
public static void main (String [] args){
        double price,number,sum,tax,shipping;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The price : ");
        price = in.nextDouble();
        System.out.print("Enter The number of book : ");
        number = in.nextDouble();    
        tax =  price+price*(7.5/100);
        shipping = number*2;
        sum = number*tax;
    System.out.println("Tax = " +tax);
    System.out.println("Shipping charge = " +shipping);   
    System.out.println("Price of the order : "+(sum+shipping));
    } 
}
    
