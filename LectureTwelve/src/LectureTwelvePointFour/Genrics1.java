package LectureTwelvePointFour;

import java.util.ArrayList;

public class Genrics1 {
public static void main(String[] args) {
	//array always support type safety
	int ar[]=new int[3];
	ar[0]=34;
	ar[1]=24;
	ar[2]=33;
	int data=ar[0];
	//during retrieval we know that in array int is stored
	//no type safety
	
	
	ArrayList a=new ArrayList();
	a.add("Telusko");
	a.add("Java");
	a.add("Alien");
	a.add(44);
//	String s1=(String)a.get(0);//as data is of object type
//	s1=s1.toLowerCase();
//	System.out.println(s1);
//	String s2=(String)a.get(1);//as data is of object type
//	s2=s2.toLowerCase();
//	System.out.println(s2);
//	String s3=(String)a.get(2);//as data is of object type
//	s3=s3.toLowerCase();
//	System.out.println(s3);
//	String s4=(String)a.get(3);//but at this place int was there but we dont know as there is no syntax error
//	s4=s4.toLowerCase();//giving exception
//	System.out.println(s4);
//	
	//---------------type safety in collection done using generics--------------------------
	ArrayList<String> list=new ArrayList<>();//now there is type safety it is called as generics
	list.add("Telusko");
	list.add("Java");
	list.add("Alien");
	//list.add(44);  getting error as it is not string
	for(String d:list) {
		System.out.println(d);
	}
	
	
	
}
}
