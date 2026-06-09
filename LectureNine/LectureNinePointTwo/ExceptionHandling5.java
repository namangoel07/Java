import java.util.Scanner;
class Alpha2{
    public void Calc() throws ArithmeticException{
        System.out.println("Connection Established");
        try{
          Scanner in=new Scanner(System.in);
         System.out.println("Kindly Enter the numerator for division");
         int n=in.nextInt();
         System.out.println("Kindly enter the denominator for division");
         int d=in.nextInt();
         int r=n/d;
         System.out.println("answer is:"+r);
        }
        catch(ArithmeticException e){
            System.out.println("Handled in Alpha");
            throw e;//throw is used to manually throw an exception
            //lines below it will not get executed else finally block and it goes in catch block of main
        }
        finally{
         System.out.println("Connection Terminated");//it will always get executed irrespective of any situation
        }
    }
}
public class ExceptionHandling5 {
    public static void main(String[] args) {
         try{
        System.out.println("Main Connection Established");
        Alpha2 a2=new Alpha2();
        a2.Calc();
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught in main");
        }
        System.out.println("Main Connection Terminated");
    }
}
