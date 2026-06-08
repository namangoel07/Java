package LectureElevenPointThree;

public class String4 {
public static void main(String[] args) {
//	final String s1="Telusko";
//	s1=s1+"Java";//heap area// error kyuki s1 is marked as final
//	final String s1="Telusko";
//	String s2=s1+"Java";
//	System.out.println(s2);
	
	//-------------------------------------
	//compareTo()-> compare value of string lexicographically
	//if it gives 0 then both strings are equal
//	String s1="NAMAN";
//	String s2="NAMAN";//gives 0 means string is equal
//	String s1="VIRAT";
//	String s2="DHONI";//gives 18 as V-D in ASCII is 18 and it is positive so string 1 is greater then string 2
    String s1="SAURAV";
    String s2="SEHWAG";//gives -4 as A-E is -4 in ASCII value as it is negative so string 2 is greater then string 1
	int res=s1.compareTo(s2);
	System.out.println(res);
	
	
}
}
