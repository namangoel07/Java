package LectureFifteenPointTwo;
import java.util.Scanner;

class Alpha2 implements Runnable
	{ 
		@Override
		public void run() {
			Banking();
		}
		public void Banking() {
			
			System.out.println("Banking Activity Started");
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the UserName:");
			int un1=in.nextInt();
			System.out.println("Enter password");
			int pass1=in.nextInt();
			System.out.println("Collect your cash");
			System.out.println("Banking Activity Terminated");
			
		}
	}
	class Beta2 implements Runnable{
		@Override
		public void run() {
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
	class Gamma2 implements Runnable{
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
public class LaunchThread4 {
public static void main(String[] args) {
	System.out.println("Application Started");
	Alpha2 a=new Alpha2();
	Beta2 b=new Beta2();
	Gamma2 g=new Gamma2();
	Thread thread1=new Thread(a);//thread is created
	Thread thread2=new Thread(b);
	Thread thread3=new Thread(g);
	//System.out.println(thread1.isAlive());//false
	thread1.start();//giving threads to thread schedular to give them life
	thread2.start();
	thread3.start();
	//System.out.println(thread1.isAlive());//true
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("Application Terminated");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
