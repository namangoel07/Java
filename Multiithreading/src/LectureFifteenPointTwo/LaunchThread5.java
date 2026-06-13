package LectureFifteenPointTwo;
import java.util.Scanner;

class Alpha3 implements Runnable
	{ 
		@Override
		public void run() {
			String threadName=Thread.currentThread().getName();
			if(threadName.equals("Bank")) {
				Banking();
			}
			else if(threadName.equals("Printing")) {
				try {
					Printing();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				try {
					focus();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
		public void Printing() throws InterruptedException {
			System.out.println("Printing Activity Started");
			for(int i=0;i<=4;i++) {
				System.out.println("**");
				Thread.sleep(3000);
			}
			System.out.println("Printing Activity Terminated");
			
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
	
public class LaunchThread5 {
public static void main(String[] args) {
	System.out.println("Application Started");
	
	 Alpha3 a1=new Alpha3();
	    Thread thread1=new Thread(a1);//thread is created
		Thread thread2=new Thread(a1);
		Thread thread3=new Thread(a1);
		thread1.setName("Bank");
		thread2.setName("Printing");
		thread3.setName("important msg");
		
		thread1.start();//giving threads to thread schedular to give them life
		thread2.start();
		thread3.start();
		
		System.out.println("Application Terminated");

}
}
