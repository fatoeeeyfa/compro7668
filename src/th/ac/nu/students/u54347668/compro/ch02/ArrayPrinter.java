package th.ac.nu.students.u54347668.compro.ch02;

public class ArrayPrinter {
    public static void main (String [] args){
        int number [] = {1,2,3,5,8,13};
        int index,initial = 0;
        for (index = initial ; index <number.length; index++){
            System.out.println("numbers[" +index +"] = " +
                    number[index]);
        
        }
    }
    
}

