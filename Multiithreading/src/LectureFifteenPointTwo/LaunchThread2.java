package LectureFifteenPointTwo;
import java.util.Scanner;
class Alpha{
	public void Banking() {
		
		System.out.println("Banking Activity Started");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the UserName:");
		int un=in.nextInt();//For EXample we dont fill data in it and there is one thread so cpu time is wasting and other things are also not working even they are independent of Banking
		System.out.println("Enter password");
		int pass=in.nextInt();
		System.out.println("Collect your cash");
		System.out.println("Banking Activity Terminated");
		
	}
}
class Beta{
	public void Printing() throws InterruptedException {
		System.out.println("Printing Activity Started");
		for(int i=0;i<=4;i++) {
			System.out.println("**");
			Thread.sleep(3000);
		}
		System.out.println("Printing Activity Terminated");
		
	}
}
class Gamma{
	public void focus() throws InterruptedException {
		System.out.println("Printing Important Meassage");
		System.out.println("Printing Activity Started");
		for(int i=0;i<=4;i++) {
			System.out.println("Focus is the key to master any skill in the planet");
			Thread.sleep(3000);
		}
		System.out.println("Printing Activity Terminated");
		
	}
}
public class LaunchThread2 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Application Started");
	Alpha a=new Alpha();
	Beta b=new Beta();
	Gamma g=new Gamma();
	a.Banking();
	b.Printing();//not resolved by making classes also 
	g.focus();
	
	
	System.out.println("Application Terminated");

}
}
