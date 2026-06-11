package LectureTwelvePointSix;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport{
	private String name;
	private String city;
	private String country;
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
}
public class Map3 {
public static void main(String[] args) {
	//jar means java files
	//var files can be frontend file,or any files
	
	
	Passport pass1=new Passport("Rohan","Benguluru","India");
	Passport pass2=new Passport("Sonu","Mumbai","India");
	Passport pass3=new Passport("Monu","Calgary","Canada");
	Integer id1=Integer.valueOf(101);
	Integer id2=Integer.valueOf(201);
	Integer id3=Integer.valueOf(301);
	HashMap<Integer,Passport> hm=new HashMap<>();
	hm.put(id1,pass1);
	hm.put(id2,pass2);
	hm.put(id3,pass3);
	
	Scanner in=new Scanner(System.in);
	System.out.println("Kindly Enter Your Passport Number");
	Integer userN=in.nextInt();
	
	//Set entry=hm.entrySet();
	Set <Entry<Integer,Passport>> entry=hm.entrySet();
	Boolean flag=false;
	//Iterator itr=entry.iterator();
	Iterator<Entry<Integer,Passport>> itr=entry.iterator();
	while(itr.hasNext()) {
		//Map.Entry keyValue=(Entry) itr.next();
         Entry<Integer,Passport> keyValue=itr.next();
		//Integer key=(Integer) keyValue.getKey();
         Integer key=keyValue.getKey();
		if(userN.equals(key)) {//equals() by default reference check karta hai, but Integer mein override hai toh values check krega directly
			System.out.println("Please find your passport details below:");
			System.out.println(keyValue.getValue());
			flag=true;
		}
	}
		
	if(flag==false) {
			System.out.println("Unable to find your information based on passport id given");
		}
		
	
	
	
}
}
