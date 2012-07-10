package th.ac.nu.students.u54347668.compro.ch02;

public class RealRange {
    public static void main(String[] args) {
        float pMax = Float.MAX_VALUE;
        float pMin = Float.MIN_VALUE;

        System.out.println("Positive Overflow = " + pMax * 10); // Positive Overflow = Infinity
        System.out.println("Positive Maximun = " + pMax); // Positive Maximun = 3.4028235E38
        System.out.println("Positive Minimum = " + pMin); // Positive Minimum = 1.4E-45
        System.out.println("Positive Underflow = " + pMin / 10); // Positive Underflow = 0.0

        System.out.println("0.0"); // 0.0

        float nMax = -Float.MIN_VALUE;
        float nMin = -Float.MAX_VALUE;

        System.out.println("Negative Overflow = " + nMax / 10); // Negative Overflow = -0.0
        System.out.println("Negative Maximun = " + nMax); // Negative Maximun = -1.4E-45
        System.out.println("Negative Minimum = " + nMin); // Negative Minimum = -3.4028235E38
        System.out.println("Negative Underflow = " + nMin * 10); // Negative Underflow = -Infinity
    }
 }
    
    

