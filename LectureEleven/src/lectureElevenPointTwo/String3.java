package lectureElevenPointTwo;

public class String3 {
public static void main(String[] args) {
	String str="RajaRamMohanRoy";
	System.out.println(str.length());//it is a method
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.substring(4,12));
	System.out.println(str.substring(4));
	char ch[]=str.toCharArray();
	System.out.println(ch.length);//15
	for(char c:ch) {
		System.out.println(c);
	}
	System.out.println(str.charAt(4));
	System.out.println(str.contains("Mohan"));//true
	System.out.println(str.startsWith("Raja"));//true
	System.out.println(str.indexOf("a"));//gives first index
	System.out.println(str.lastIndexOf("a"));//gives last index of a
	
	
}
}
