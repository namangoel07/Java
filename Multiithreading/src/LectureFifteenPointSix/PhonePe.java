package LectureFifteenPointSix;

public class PhonePe extends Thread{
	private HSBCBank bank;
    public PhonePe(HSBCBank bank) {
    	this.bank=bank;
    }
	
	@Override
	public void run() {
		//HSBCBank bank=new HSBCBank(344);-> by this it will be tightly coupled
	   System.out.println("Check Balance");
	   bank.checkBalance();

	}


}
