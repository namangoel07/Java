package LectureFifteenPointThree;
//DeadLock Condition
//how to avoid->Properly using of synchronized keyword
class Library1 implements Runnable{
	String res1=new String("Java");
	String res2=new String("DSA");
	String res3=new String("System Design");
	@Override 
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("SONU")) {
			try 
			{  System.out.println("STUDENT1 has entered into the Library");
				Thread.sleep(3000);
				synchronized(res3)
				{
					System.out.println("STUDENT1 has acquired"+res3);
					Thread.sleep(4000);
					synchronized(res2) {
						System.out.println("STUDENT1 has acquired"+res2);
						Thread.sleep(4000);
					}
					synchronized(res1) {
						System.out.println("STUDENT1 has acquired"+res1);
						Thread.sleep(4000);
					}
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			try 
			{  System.out.println("STUDENT2 has entered into the Library");
			
				Thread.sleep(3000);
				synchronized(res1)
				{
					System.out.println("STUDENT2 has acquired"+res1);
					Thread.sleep(4000);
					synchronized(res2) {
						System.out.println("STUDENT2 has acquired"+res2);
						Thread.sleep(4000);
					}
					synchronized(res3) {
						System.out.println("STUDENT2 has acquired"+res3);
						Thread.sleep(4000);
					}
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}
	}
}
public class LaunchThread9 {
public static void main(String[] args) {
	Library1 lib1=new Library1();
	Thread thread1=new Thread(lib1);
	Thread thread2=new Thread(lib1);
	thread1.setName("SONU");
	thread2.setName("MONU");
	thread1.start();
	thread2.start();

}
}
