
package th.ac.nu.students.u54347668.compro.ch02;

public class Casting {
    public static void main(String[] args) {
        double d = 257.234;
        int i = (int) d;
        System.out.println(i); // 257
        byte b = (byte) d;
        System.out.println(b); // 1 (257%256)
    }
    
    
}
