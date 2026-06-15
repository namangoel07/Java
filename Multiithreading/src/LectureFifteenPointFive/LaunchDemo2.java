package LectureFifteenPointFive;

public class LaunchDemo2 implements Runnable{
	public static void main(String[] args) {
		//LaunchDemo2 ld=new LaunchDemo2();
		Thread t=new Thread(new LaunchDemo2());
		t.start();
		Runnable r=()->System.out.println("Task of Thread 2");
		Thread t2=new Thread(r);
		t2.start();
//		Runnable r = new Runnable() {same as lambda
//		    @Override
//		    public void run() {
//		        System.out.println("Task of Thread 2");
//		    }
//		};
	}
	@Override
	public void run() {
		System.out.println("Task of thread");
	}
}
