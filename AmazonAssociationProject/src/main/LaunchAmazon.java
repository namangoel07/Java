package main;

import services.BlueDart;
import services.FirstFlight;

public class LaunchAmazon {
public static void main(String[] args) 
{   //Setter Injection
	//Amazon amz=new Amazon();
	//amz.setService(new FedEx());
	//amz.setService(new BlueDart());
	//Constructor Injection
	Amazon amz=new Amazon(new FirstFlight());
	amz.setService(new BlueDart());//BlueDart will run as it is setting
	Boolean status= amz.deliverTheProduct(454.5);
	if(status) {
		System.out.println("Product is Delivered ");
	}
	else {
		System.out.println("Failed to deliver the product");
	}
}
}
