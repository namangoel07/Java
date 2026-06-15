package LectureFifteenPointSix;

public class ObjectLevelLocking {
public static void main(String[] args) {
	//object level locking
	HSBCBank bank1=new HSBCBank(4000);
	HSBCBank bank2=new HSBCBank(4000);
	Atm atm=new Atm(bank1);
	atm.setName("ATM Thread");
	
	GooglePay gpay=new GooglePay(bank1);//at this time only one method from bank is running and locked rest are in blocked state 
	gpay.setName("GPay Thread");
	
//	GooglePay gpay=new GooglePay(bank2);
//	gpay.setName("GPay Thread"); //in this 2 methods from bank are running and locked as we have given different refernce in it
	
	PhonePe ppay=new PhonePe(bank1);
	ppay.setName("PhonePe Thread");
	
	atm.start();
	gpay.start();
	ppay.start();
}
}
