package LectureFifteenPointTwo;

public class LaunchThread {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Application Started");
	Thread thread=Thread.currentThread();
	System.out.println(thread.getName());//deafult name main
	System.out.println(thread.getPriority());//default priority 5
	Thread.sleep(3000);
	thread.setName("Telusko");
	thread.setPriority(3);
	System.out.println(thread.getName());
	System.out.println(thread.getPriority());
	System.out.println("Appliaction Terminated");
			
	
}
}
