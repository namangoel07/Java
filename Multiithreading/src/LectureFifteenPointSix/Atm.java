package LectureFifteenPointSix;

public class Atm extends Thread
{  private HSBCBank bank;
    public Atm(HSBCBank bank) {
    	this.bank=bank;
    }
	
	@Override
	public void run() {
		//HSBCBank bank=new HSBCBank(344);-> by this it will be tightly coupled
	   System.out.println("Withdrawal");
	   bank.withdrawal(4000);// at a time only one method is running

	}

}
