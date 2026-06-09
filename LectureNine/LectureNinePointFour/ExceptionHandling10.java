import java.util.Scanner;
class InvalidCustomerException extends Exception//checked exception
{
    public InvalidCustomerException(String msg){
        super(msg);
    }

}
class Atm{
    private int acc=4545;
    private int pw=1234;
    int accountNo;
    int Password;
    public void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("Kindly enter account number");
        accountNo=in.nextInt();
        System.out.println("Kindly Enter the password");
        Password=in.nextInt();
    }
    public void verify() throws InvalidCustomerException{
        if(acc==accountNo && pw==Password){
            System.out.println("Proceed to withdraw");
        }
        else{
            // System.out.println("Ohhhh!");
            // input();
            // verify();
            //--------------------------------
            InvalidCustomerException ice=new InvalidCustomerException("Wrong Credentials");
            System.out.println(ice.getMessage());
            throw ice; 
            //or--------------------
           // throw new InvalidCustomerException();//throw ek signal hai jo bolta hai — "kuch galat hua, main kaam band karta hoon, upar bhej raha hoon"
        }
    }
}
class Bank{
    public void inititate(){
        Atm atm=new Atm();
        try{

        
        atm.input();
        atm.verify();
        }
        catch(InvalidCustomerException ice){
System.out.println("Try Again!");
try{

        
        atm.input();
        atm.verify();
        }
        catch(InvalidCustomerException ice2){
            System.out.println("Try Again");
            try{

        
        atm.input();
        atm.verify();
        }
        catch(InvalidCustomerException ice3){
            
       System.out.println("Ohh! Wrong it is");
        }

        }
        }
    }
}
public class ExceptionHandling10 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.inititate();

    }
}
