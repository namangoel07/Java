package LectureFifteenPointSix2;

public class GooglePay extends Thread{
	
	@Override
	public void run() {
		//HSBCBank bank=new HSBCBank(344);-> by this it will be tightly coupled
	   System.out.println("Deposit");
	   HSBCBank.deposit(4000);

	}


}
