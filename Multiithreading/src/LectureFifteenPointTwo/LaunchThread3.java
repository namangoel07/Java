package LectureFifteenPointTwo;
import java.util.Scanner;
	class Alpha1 extends Thread
	{ 
		@Override
		public void run() {
			Banking();
		}
		public void Banking() {
			
			System.out.println("Banking Activity Started");
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the UserName:");
			int un1=in.nextInt();//For EXample we dont fill data in it and there is one thread so cpu time is wasting and other things are also not working even they are independent of Banking
			System.out.println("Enter password");
			int pass1=in.nextInt();
			System.out.println("Collect your cash");
			System.out.println("Banking Activity Terminated");
			
		}
	}
	class Beta1 extends Thread{
		@Override
		public void run() {//Pehle main() khud exception upar JVM ko de deta tha — isliye try-catch ki zarurat nahi thi.
			                //    Ab run() ke paas upar koi nahi hai jo le sake — isliye khud hi catch karna padta hai.
			try {
				Printing();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		public void Printing() throws InterruptedException {
			System.out.println("Printing Activity Started");
			for(int i=0;i<=4;i++) {
				System.out.println("**");
				Thread.sleep(3000);
			}
			System.out.println("Printing Activity Terminated");
			
		}
	}
	class Gamma1 extends Thread{
		@Override
		public void run() {
		
		try {
			focus();
		
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
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
public class LaunchThread3 {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Application Started");
		Alpha1 a=new Alpha1();//in inheritance making object of child class is equal to making object of parent class
		Beta1 b=new Beta1();//these are equivalent to creating 3 threads
		Gamma1 g=new Gamma1();
//		a.run();
//		b.run();
//		g.run();
//		with these run only like single thread
		a.start();//we have to hand over thread to threadscheduler
		b.start();
		
		//life is given to thread by using start
		a.join();
		b.join();
		g.start();//now first a and b thread will complete work then g will start work
		g.join();
		System.out.println("Application Terminated");

	}
}
	
