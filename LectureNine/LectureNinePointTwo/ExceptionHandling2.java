import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
         System.out.println("Connection Established");
         try{

         
          Scanner in=new Scanner(System.in);
         System.out.println("Kindly Enter The Numerator for divsion");
         int n=in.nextInt();
         System.out.println("Kindly Enter the denominator for division");
         int d=in.nextInt();
         int res=n/d;
         System.out.println("Answer is:"+res);
         //----------------------------------------------
         System.out.println("Kindly enter size of an array");
         int size=in.nextInt();
         int ar[]=new int[size];
         System.out.println("Kindly Enter element to be inserted in an array");
         int elem=in.nextInt();
         System.out.println("Kindly enter position at which element to be inserted");
         int index=in.nextInt();
         ar[index]=elem;
         System.out.println("Data inserted in array is"+ar[index]);
         }
        //  catch(Exception e){
        //     System.out.println("Some problem");
        //  }//not to write at top as it is parent of all Exception so other Exception defined will not work
         catch(ArithmeticException e){
            System.out.println("Please enter non zero number");
         }
         catch(NegativeArraySizeException e){
            System.out.println("Please Enter non zero number");
         }

         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bound array");
         }
         catch(Exception e){
            System.out.println("Some problem");
         }
         System.out.println("Connection Terminated");
    }
}
