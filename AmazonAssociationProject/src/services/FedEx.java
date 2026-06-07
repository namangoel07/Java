package services;

public class FedEx implements IDeliveryServices {

	@Override
	public Boolean deliverProduct(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Product Delivered through FedEx and amount paid is:"+amount);

		return true;
	}

}
