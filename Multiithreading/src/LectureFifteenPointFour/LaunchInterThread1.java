package LectureFifteenPointFour;
class Producer extends Thread
{
	Queue q;
	public Producer(Queue q) {
		this.q=q;
	}
	int i=1;
	public void run() {
		while(true)
		{
			q.produce(i++);
		}
	}
	
}
class Consumer extends Thread
{
	Queue q;
	public Consumer(Queue q){
		this.q=q;
	}
	public void run() {
		while(true) {
			q.consume();
		}
	}
	
	
}
class Queue
{
	int data;
	boolean flag=false;
	synchronized public void produce(int i)
	
	{
		try
		{    if(flag==true) 
		{
			System.out.println("Producer in wait state");
			
			wait();//wait(),notify() method must be written in synchronized environment
		}
		else {
		    data=i;
	        System.out.println("I have produced data"+data);
	        flag=true;
	        notify();//notifying other thread in waiting state
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void consume() {
		try {
			if(flag==false) {
				System.out.println("Consumer in wait state");
				wait();
			}
			else {
				System.out.println("I have consumed data"+data);
				flag=false;
				notify();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class LaunchInterThread1 {
public static void main(String[] args) {
	Queue q=new Queue();
	
	
	new Producer(q).start();//dependency injection
	new Consumer(q).start();
	
}
}
