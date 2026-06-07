package services;

public class FirstFlight implements IDeliveryServices {

	@Override
	public Boolean deliverProduct(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Product Delivered through FirstFlight and amount paid is:"+amount);
		return true;
	}

}
