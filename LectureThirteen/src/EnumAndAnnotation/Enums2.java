package EnumAndAnnotation;
enum Result{//actucally in enum a class is created with extending enum
	PASS,JUSTPASS,TOP;
	//public static final Result PASS=new Result(); //it is behind the scene
	//public static final Result JUSTPASS=new Result();
	//public static final Result TOP=new Result();
//	enum week{
//		MON;
//	}//enum inside enum is allowed
	
	int marks;
	Result(){
		System.out.println("Constructor of Enum");
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
}
public class Enums2 {
public static void main(String[] args)
{
	//Result result=Result.PASS;
//	result.setMarks(54);
//	System.out.println(result.getMarks());//giving 3 times constructor of enum as three times object is created
	
	Result.PASS.setMarks(54);
	int marks=Result.PASS.getMarks();
	System.out.println(marks);
	
	int marks2=Result.JUSTPASS.getMarks();
	System.out.println(marks2);
	
	
}
}
