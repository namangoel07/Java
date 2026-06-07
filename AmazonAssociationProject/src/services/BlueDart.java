package services;

public class BlueDart implements IDeliveryServices {

	@Override
	public Boolean deliverProduct(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Product Delivered through BlueDart and amount paid is:"+amount);

		return true;
	}

}
