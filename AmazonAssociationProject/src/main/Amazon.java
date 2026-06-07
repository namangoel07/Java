package main;
import services.IDeliveryServices;

public class Amazon {
	
	private IDeliveryServices service;
	public Amazon(IDeliveryServices service){
		this.service=service;
	}
	
	
 public void setService(IDeliveryServices service)//IDeliveryServices service=new FedEx();
 {
		this.service= service;
	}
 public Amazon() {
	 
 }


 public Boolean deliverTheProduct(Double amount) {
//	 FedEx fd=new FedEx();
//	 Boolean status=fd.deliverProduct(amount);
//	 
//	 return status;
	 //return fd.deliverProduct(amount);
	 return service.deliverProduct(amount);
	 
 }
}
