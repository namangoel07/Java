package LectureTwelvePointFour;

import java.util.ArrayList;

class Employee{
	private Integer id;
	private String name;
	private String city;
	Employee(Integer id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Employee[id="+id+",name ="+name+",city="+city+"]";
		
	}
}
public class genrics2 {
public static void main(String[] args) {
	ArrayList<Employee> l=new ArrayList<>();
	//l.add("Java"); error 
	l.add(new Employee(1,"Yash","Bengaluru"));
	l.add(new Employee(2,"Raj","Pune"));
	for(Employee e:l) {
		System.out.println(e);
	}
	
	//ArrayList<int> e=new ArrayList<>();//primitive is not allowed 
	//ArrayList<Object> e=new ArrayList<Integer>();//one side parent other side child not allowed
	ArrayList<Integer> e=new ArrayList<>();
	
}
}
