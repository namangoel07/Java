package LectureFifteenPointSix2;

public class PhonePe extends Thread{
	private HSBCBank bank;
	public PhonePe(HSBCBank bank) {
		this.bank=bank;//as static method can be run without giving reference and with giving refernce
	}
	@Override
	public void run() {
	
	   System.out.println("Check Balance");
	   bank.checkBalance();

	}


}
