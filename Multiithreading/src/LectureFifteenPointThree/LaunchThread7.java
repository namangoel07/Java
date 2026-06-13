package LectureFifteenPointThree;

class MyCar1 implements Runnable
{
	@Override
	public void run() {//without synchronized all are in race condition every thread want to complete its task and a chaos was there
		//by adding synchronised only 1 thread will run at a time
		try {
			System.out.println(Thread.currentThread().getName()+" has entered parking lot");
			Thread.sleep(4000);
			synchronized(this) {
			System.out.println(Thread.currentThread().getName()+" has entered into Car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has started to driving car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has came back and parked");
			
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class LaunchThread7 {
public static void main(String[] args) {
	MyCar1 car=new MyCar1();
	Thread t1=new Thread(car);
	Thread t2=new Thread(car);
	Thread t3=new Thread(car);
	t1.setName("RAMESH");
	t2.setName("SURESH");
	t3.setName("MAHESH");
	t1.start();
	t2.start();
	t3.start();
	
}
}
