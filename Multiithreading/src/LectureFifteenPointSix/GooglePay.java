package LectureFifteenPointSix;

public class GooglePay extends Thread{
	private HSBCBank bank;
    public GooglePay(HSBCBank bank) {
    	this.bank=bank;
    }
	
	@Override
	public void run() {
		//HSBCBank bank=new HSBCBank(344);-> by this it will be tightly coupled
	   System.out.println("Deposit");
	   bank.deposit(4000);

	}


}
