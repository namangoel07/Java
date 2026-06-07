package lectureeightpointfour;
//abstract class P{
//	abstract void show();
//}
//class R extends P{
//	public void show() {
//		System.out.println("in show");
//	}
//}
@FunctionalInterface //-> interface with one method
//interface P{
//	void show();
//	//void showData();
//	default void showData() {
//		System.out.println("Abstract method only one");
//}
//	String toString(); //no error as toString is built in method in java
//}
//----------------------
interface Person{
	int add(int x,int y);
}
class Personimp implements Person{
	public int add (int x,int y) {
		return x+y;
	}
}





public class LambdaDemo {
public static void main(String[] args) {
//	P obj=new R();
//	obj.show();
//	P obj= new P() {
//	 public void show() {
//		 System.out.println("By anonymous class");
//	 }
//	};
//	P obj=() -> {//replacement of anonymous function
//		System.out.println("Arrow function");
//	};
	
	//obj.show();
	//--------------------------------------------------
//	Person p=new Person() {
//		public int add (int x,int y) {
//			return x+y+1;
//		}
//	};
//	Person p=(int x,int y)->{
//		return x+y+2;
//	};
	//more shorter 
	Person p=(x,y)-> x+y+2;//only run ones to run more time write full again
	int result = p.add(5, 6);// this gives 13 anonymous will run
	System.out.println(result); 
}
}
