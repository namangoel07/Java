package LectureElevenPointThree;

public class String6 {
public static void main(String[] args) {
	//mutable string
	//StringBuffer s="TElusko";//error
	//StringBuffer s=new StringBuffer("Telusko");//new keyword so in heap area
	StringBuilder s=new StringBuilder("Telusko");
	System.out.println(s);
	s.append(45.4);
	s.append(true);//in this same string is being modified and in String we reassign the value to old String or new so that it start refering to new string value as string is immutable
	System.out.println(s);
	
}
}
