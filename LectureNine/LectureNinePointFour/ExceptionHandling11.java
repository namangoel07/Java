import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }
}
class Applicant{
int age;
public void input(){
    Scanner in=new Scanner(System.in);
    System.out.println("Kindly Enter your age:");
    age=in.nextInt();

}
public void verify() throws UnderAgeException,OverAgeException{
    if(age>=18 && age<=60){
        System.out.println("You are Eligible Proceed with the Application");
    }
    else if(age<18) {
         UnderAgeException ug=new UnderAgeException("You are Under Age Dude");
         System.out.println(ug.getMessage());
         throw ug;
    }
    else{
      OverAgeException og=new OverAgeException("You are over Age bro");
      System.out.println(og.getMessage());
      throw og;
    }
}
}
class RTO{
    public void inititate(){
        Applicant a=new Applicant();

        try{
            a.input();
            a.verify();
        }
        catch(UnderAgeException | OverAgeException e){
            System.out.println("Try Again");
            try{
            
            a.input();
            a.verify();
        }
        catch(UnderAgeException | OverAgeException e1){
            System.out.println("Try Next Time");
        }
        }
    
    }
}
public class ExceptionHandling11 {
    public static void main(String[] args) {
        System.out.println("License Application");
        RTO r=new RTO();
        r.inititate();
    }
}
