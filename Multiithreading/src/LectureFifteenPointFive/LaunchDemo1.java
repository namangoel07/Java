package LectureFifteenPointFive;

public class LaunchDemo1  extends Thread{
	public LaunchDemo1() {
		
	}
	public LaunchDemo1(String name) {
		super(name);
	}
public static void main(String[] args) {
	System.out.println("Telusko Learning App");
	LaunchDemo1 ld1=new LaunchDemo1("MyThread1");
	LaunchDemo1 ld2=new LaunchDemo1("My Thread2");
	ld1.start();
	ld2.start();
}
   @Override
	public void run() {
		System.out.println("Task of my Thread");
	}
	
	}

