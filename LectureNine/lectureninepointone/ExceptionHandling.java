package lectureninepointone;

import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) {
         System.out.println("Connection Established");
         try{
         Scanner in=new Scanner(System.in);
         System.out.println("Kindly Enter the numerator for division");
         int n=in.nextInt();
         System.out.println("Kindly enter the denominator for division");
         int d=in.nextInt();
         int r=n/d;//for 1/0->error  tht is logical error it is called exception which occurs during run time
         System.out.println("answer is:"+r);
         }
         catch(Exception e){
            System.out.println("Please enter non zero denominator");
         }
         System.out.println("Connection Terminated");
    }
}