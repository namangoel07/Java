package LectureFifteenPointThree;
class MSWord extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("TYPE")) {
			typing();
		}
		else if(name.equals("SPELL")) {
			spellCheck();
		}
		else {
			autoSave();
		}
	}
	public void typing() {
		try {
			
			for(int i=0;i<3;i++) {
				System.out.println("Typing....");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void spellCheck() {
    try {
		for(;;) {//even though i have specified infinite loop but it is daemon thread and daemon thread follows primary thread so it will also execute till <3+1
			System.out.println("Spell Checking....");
			Thread.sleep(3000);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void autoSave() {
      try {
			for(;;) {
				System.out.println("Auto Saving....");
				Thread.sleep(3000);
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
//it is race condition  all threads are just want to complete the thread
public class LaunchThread10 {
public static void main(String[] args) {
	MSWord ms1=new MSWord();
	MSWord ms2=new MSWord();
	MSWord ms3=new MSWord();
	
	
	ms1.setName("TYPE");
	ms2.setName("SPELL");
	ms3.setName("SAVING");
	
	ms2.setDaemon(true);//to make a thread daemon also to set priority low between 1 to 5
	ms3.setDaemon(true);//daemon activity must be written is infinite loop
	
	
	//daemon threads are at last executing atleast once 
	//garbage collector is a daemon thread
	
	ms2.setPriority(2);
	ms3.setPriority(3);//high number high priority
	
	ms1.start();
	ms2.start();
	ms3.start();
	
//	A daemon thread is a background thread that provides support services to user threads.
//
//	Simple Definition
//	User Thread → Performs the main work of the application.->main thread or primary thread
//	Daemon Thread → Supports the user threads in the background.
//like while typing it checks spelling,grammer etc.
//	The JVM keeps running as long as at least one user thread is alive
}
}
