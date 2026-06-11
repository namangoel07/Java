package LectureTwelvePointFour;

import java.util.ArrayList;
import java.util.List;

class Human{
	int age;
	public void disp() {
		System.out.println("Human are best creature ");
	}
}
class Student extends Human{
	
}
class Emp{
	
}
public class Generics4 {
public static void main(String[] args) {
//	Object obj=new Object();
//	String s=new String("Alien");
//	obj=s;
	//s=obj;
	Human h=new Human();
	Student s=new Student();
	h=s;
	//s=h; //no without downcasting
//	ArrayList<Human> hlist1=new ArrayList<>();
//	ArrayList<Student> slist1=new ArrayList<>();
	//hlist1=slist1;//not allowed compile time error
	
	
	ArrayList<?> hlist2=new ArrayList<>();//unknown--> wild card
	ArrayList<Student> slist2=new ArrayList<>();
	hlist2=slist2;
	
//	ArrayList<? extends Human> hlist3 =new ArrayList<>();//upperbound//of human type or child of HUman
//	ArrayList<Student> slist3=new ArrayList<>();
//	ArrayList<Employee> elist3=new ArrayList<>();
//	ArrayList<Object> olist3=new ArrayList<>();
//	hlist3=slist3;
	//hlist3=elist3;//error i.e. compile time error
	//hlist3=olist3;error
	
//	ArrayList<? super Human> hlist3 =new ArrayList<>();//lowerbound //either human or super of human
//	ArrayList<Student> slist3=new ArrayList<>();
//	ArrayList<Employee> elist3=new ArrayList<>();
//	ArrayList<Object> olist3=new ArrayList<>();
//	hlist3=slist3;
//	hlist3=elist3;//error
	//hlist3=olist3;//as object is parent of all class
	
	
//	ArrayList<Human> hlist=new ArrayList<Human>();
//	hlist.add(new Human());
//	hlist.add(new Human());
//	hlist.add(new Human());
//	hlist.add(new Human());
//	invockDisp(hlist);

	
	ArrayList<Student> hlist=new ArrayList<>();
	hlist.add(new Student());
	hlist.add(new Student());
	hlist.add(new Student());
	hlist.add(new Student());
	//invockDisp(hlist); error as only human it takes
	
	
}
//public static void invockDisp(List<? extends Human> list)
public static void invockDisp(List<Human> list)
{//it takes human or child of human
	for(Human h:list) {
		System.out.println(h);
	}
}
}
