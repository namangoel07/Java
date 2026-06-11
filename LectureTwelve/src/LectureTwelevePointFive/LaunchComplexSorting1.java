package LectureTwelevePointFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
	int age;
	String name;
	double avg;
	public Cricketer(int age,String name,double avg) {
		this.age=age;
		this.name=name;
		this.avg=avg;
	}
	@Override
	public String toString() {
		return "Cricketer[age="+age+",name="+name+",avg="+avg+"]";
	}
}
//interface can be implemented using 3 method
//implements
//anonymous inner class
//lambda 
//class Alpha implements Comparator<Cricketer>{
//	@Override
//	public int compare(Cricketer o1,Cricketer o2) {//two parameters as it is outside cricketer class
//		if(o1.avg>o2.avg) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
//}
public class LaunchComplexSorting1 {
public static void main(String[] args) {
	Cricketer c1=new Cricketer(95,"Virat",88.8);
	Cricketer c2=new Cricketer(78,"Rohit",78.9);
	Cricketer c3=new Cricketer(88,"Dhoni",80.0);
	ArrayList<Cricketer> list=new ArrayList<>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	System.out.println(list);
	//Collections.sort(list);//error
//	Alpha a=new Alpha();
//	Collections.sort(list,a);
//	System.out.println(list);
	
//	Comparator<Cricketer> c=new Comparator<Cricketer>()//anonymous inner class
//	{
//		@Override
//		public int compare(Cricketer o1,Cricketer o2) {
//			if(o1.avg>o2.avg) {
//				return 1;
//			}
//			else {
//				return -1;
//			}
//		}
//		
//		
//};
	Comparator<Cricketer> c=(Cricketer o1,Cricketer o2)->{
		if(o1.age>o2.age) {
			return 1;
		}
		else {
			return -1; 
		}
		};
		
		Comparator<Cricketer> co = (Cricketer o1, Cricketer o2) -> {
		    return o1.name.compareTo(o2.name);
		};
Collections.sort(list,c);
Collections.sort(list,co);
System.out.println(list);

}
}
