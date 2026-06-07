package lectureeightpointfour;
interface p{
	void show(String s);
}
public class LambdaDemo2 {
public static void main(String [] args) {
//	p obj=new p() {
//		public void show(String s) {
//			System.out.println(s.length());
//		}
//	};
	p obj=s-> System.out.println(s.length());
	obj.show("Yash");
}
}
