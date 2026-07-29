package other;

public class ClassForlearn {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		 // Class.forName("other.Demo");//only static one is running
		  Class.forName("other.Demo").newInstance();//both are running

}
}
class Demo{
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance block=> non static  ");
	}
}

