import java.util.Scanner;
class Alpha1{
    public void Calc() throws ArithmeticException{
        System.out.println("Connection Established");
         Scanner in=new Scanner(System.in);
         System.out.println("Kindly Enter the numerator for division");
         int n=in.nextInt();
         System.out.println("Kindly enter the denominator for division");
         int d=in.nextInt();
         int r=n/d;
         System.out.println("answer is:"+r);
         
         System.out.println("Connection Terminated");
    }
}
public class ExceptionHandling4 {
    public static void main(String[] args) {
        try{
        System.out.println("Main Connection Established");
        Alpha1 a1=new Alpha1();
        a1.Calc();
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught");
        }
        System.out.println("Main Connection Terminated");
    }
}
