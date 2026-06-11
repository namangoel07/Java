package LectureTwelevePointFive;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>{
	int age;
	String name;
	double avg;
	public Cricketer1(int age,String name,double avg) {
		this.age=age;
		this.name=name;
		this.avg=avg;
	}
	@Override
	public String toString() {
		return "Cricketer1[age="+age+",name="+name+",avg="+avg+"]";
	}
	@Override
	public int compareTo(Cricketer1 o) {//only one parameter as it is inside cricketer1 class
		if(this.avg>o.avg) 
			return 1;
		else 
			return -1;	
	}
}
public class ComplexSorting2 {
public static void main(String[] args) {
	Cricketer1 c1=new Cricketer1(95,"Virat",88.8);
	Cricketer1 c2=new Cricketer1(78,"Rohit",78.9);
	Cricketer1 c3=new Cricketer1(88,"Dhoni",80.0);
	ArrayList<Cricketer1> list1=new ArrayList<>();
	list1.add(c1);
	list1.add(c2);
	list1.add(c3);
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);
	
}
}
