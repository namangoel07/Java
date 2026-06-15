package LectureFifteenPointSix2;

public class ClassLevelLocking {
public static void main(String[] args) {
HSBCBank bank1=new HSBCBank();
HSBCBank bank2=new HSBCBank();
	Atm atm=new Atm();
	atm.setName("ATM Thread");
	
	GooglePay gpay=new GooglePay();
	gpay.setName("GPay Thread");
	
	PhonePe ppay=new PhonePe(bank2);
	ppay.setName("PhonePe Thread");//in class level locking 2 methods are running and locking but in class level locking one method is running even with different object and class is locked  
	
	atm.start();
	gpay.start();
	ppay.start();

}
}
