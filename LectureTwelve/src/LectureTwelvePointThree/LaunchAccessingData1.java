package LectureTwelvePointThree;

import java.util.ArrayList;
import java.util.Iterator;

public class LaunchAccessingData1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
   //int d=(int)a.get(2);
	//System.out.println(d);
//	for(int i=0;i<a.size();i++) {
//		System.out.println(a.get(i));
//	}
	
//	for(Object o:a) {
//		System.out.println(o);
//	}
//	for(int i=0;i<a.size();i++) {
//		Integer data=(Integer) a.get(i);
//		System.out.println(data);
//		a.add(44);//44 is printing infinite time in for loop as collection has dynamic size so it will be problem to access them by using for loop
//	}
	//Iterable
	Iterator itr=a.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());//first check then print as if next is not there then it can be give error
		a.add(44);
	}
	//Recommended is to use iterable for accessing data
	
	
	
}
}
