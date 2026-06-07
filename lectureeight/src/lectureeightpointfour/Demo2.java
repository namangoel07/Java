package lectureeightpointfour;
class A1{
public void show()
{
    System.out.println(" A show");
}
public void display() 
{
	System.out.println("In display");
}
public void getData() 

{
	System.out.println("data in");
}
 }
	
	  class B1 extends A1 { 
		  public void show(){
			  System.out.println(" B show"); 
	  }
	   }
	 

public class Demo2 {
	public static void main(String[] args) {
		A1 obj=new A1() {//it is called Anonymous inner class 
    		public void show() {
    			System.out.println("Here it is in A show");//ye override hora h without using inheritance 
    		}//we cannot reuse it if we want to reuse it we have to write it again
//    		public void dataShow() {
//    			System.out.println("new data");
//    		}
    		public void display()
    		{
    			System.out.println("Display");
    			}
    		};
//		new A1() {
//			public void show() {
//    			System.out.println("Here it is in A show");//ye override hora h without using inheritance 
//    		}//we cannot reuse it if we want to reuse it we have to write it again
//    		public void dataShow() {
//    			System.out.println("new data");
//    		}
//    		public void display()
//    		{
//    			System.out.println("Display");
//    			}
//		}.getData();
    	obj.show();//not run in new A() case as it do not have name
    	//obj.dataShow();// we cannot access new methods
    	obj.display();
    	//new B().show();we can only use it once it is also called anonymous as it do not have a reference
    	
	}
}
