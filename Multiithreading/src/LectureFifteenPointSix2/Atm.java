package LectureFifteenPointSix2;

public class Atm extends Thread
{ 
	
	@Override
	public void run() {
	   System.out.println("Withdrawal");
	   HSBCBank.withdrawal(4000);

	}

}
