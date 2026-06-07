package lecturesix.lecturesixpointeight;
import java.util.Scanner;
class Farmer{
    float pa;
    float td;
    float si;
   // float roi;
   static float roi;
   static{
    roi=2.5f;
   }
    void acceptInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly Enter the loan amount required in rupees");
        pa=scan.nextFloat();
        System.out.println("Kindly enter the time duration required to repay loan in months");
        td=scan.nextFloat();
       // roi=2.5f;// we can make it static as one time memory will be allocated
    }
    void compute(){
        si=(pa*td*roi)/100.0f;

    }
    void disp(){
        System.out.println("Hello you simple interest is:"+si);
    }
}
public class static6 {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        f1.acceptInput();
        f1.compute();
        f1.disp();
        Farmer f2=new Farmer();
        f2.acceptInput();
        f2.compute();
        f2.disp();
        
    }
    
}
