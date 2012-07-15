
package th.ac.nu.students.u54347668.compro.ch02;

import java.util.Scanner;
public class homework2 {
public static void main(String[]args){
    int startTime, shh, smm;
    int endTime, ehh, emm;
    int hour,minutes;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time : ");
        startTime = in.nextInt();
        shh = startTime/100;
        smm = startTime%100;
        
        System.out.print("Please enter the second time : ");
        endTime = in.nextInt();
        ehh = endTime/100;
        emm = endTime%100;
       
       if(ehh>shh){
           if(emm>smm){
        hour= (ehh)-(shh);
        minutes= emm-smm;
        System.out.print(hour+" hours ");
        System.out.println(minutes+" minutes ");         
             }else{
        hour= (ehh)-(shh);
        minutes= smm-emm;
        System.out.print(hour+" hours ");
        System.out.println(minutes+" minutes "); 
           }
        }
       if(shh>ehh){
           if(smm>emm){
        hour= 13+(ehh)-(24-shh);
        minutes= smm-emm;
        System.out.print(hour+" hours ");
        System.out.println(minutes+" minutes "); 
       }else{
        hour= 13+(ehh)-(24-shh);
        minutes= emm-smm;
       System.out.print(hour+" hours ");
       System.out.println(minutes+" minutes "); 
               
      }
}     
}
}

    
    

