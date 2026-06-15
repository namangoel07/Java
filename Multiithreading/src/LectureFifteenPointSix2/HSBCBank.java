package LectureFifteenPointSix2;

public class HSBCBank {

	static int accountBal=4000;
//	public HSBCBank(int accountBal) {
//		this.accountBal=accountBal;
//	}
	synchronized static public void withdrawal(int withdrawal) {
		accountBal=accountBal-withdrawal;
	}
	synchronized static public void deposit(int deposit) {
		accountBal=accountBal+deposit;
		
	}
	synchronized static public void checkBalance() {
		System.out.println("The Balance in the account is:"+accountBal);
	}
}
