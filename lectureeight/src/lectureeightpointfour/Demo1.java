package lectureeightpointfour;
class A{
public void show(){
    System.out.println(" A show");
}
public void display() {
	System.out.println("In display");
}
public void getData() {
	System.out.println("data in");
}
 }
 class B extends A{
public void show(){
System.out.println(" B show");
}
 }


//class Person{//we cannot make it static 
//	  int age;
//	  String name;
//	  public void printName(){
//	    System.out.println("Yashraj");
//	  }
//	 // static class phone
//	  class Phone{
//	    int price;
//	    String model;
//	    public void details(){
//	        System.out.println("here is details");
//	    }
//	}
//
//
//	}
/** 
 * This is my weekend project 
 */
public class Demo1 {
	
	    public static void main(String[] args) {
	       // A obj=new A();
//	        A obj=new B();
//	         obj.show();
	    	A obj=new A() {//it is called Anonymous inner class 
	    		public void show() {
	    			System.out.println("Here it is in A show");//ye override hora h without using inheritance 
	    		}//we cannot reuse it if we want to reuse it we have to write it again
	    		public void dataShow() {
	    			System.out.println("new data");
	    		}
	    		public void display()
	    		{
	    			System.out.println("Display");
	    			}
	    		};
	    	obj.show();
	    	//obj.dataShow();// we cannot access new methods
	    	obj.display();
	    	//new B().show();we can only use it once it is also called anonymous as it do not have a reference
	    	
	    	
	    	//---------------------------------
	   // Person obj=new Person();
	   // obj.printName();
	   // Person.Phone obj1=new Person.Phone(); if phone class is not static then t will not run
	    //obj1.details();
	   // Person.Phone obj1=obj.new Phone();//if phone is not static 
	   // obj1.details();
	    //Phone obj1=new Phone();//it will not run as it is inside person
	    }
	}


