package IO_Operation;
import java.io.*;
public class LaunchIO4 {
public static void main(String[] args) throws IOException {
	String filePath2="D:\\personal\\college\\java by telusko\\IO\\src\\java.txt";
	FileReader reader=null;
	
	try {
		File file4=new File(filePath2);
		reader=new FileReader(file4);
		
//		int i=reader.read();//giving integer value
//		//System.out.println((char)i);
//		while(i!=-1) {
//			System.out.println(i+"->");
//			System.out.println((char)i);
//			i=reader.read();//to read next character else same character will be print
//		}
		
		char ch[]=new char[(int) file4.length()];//-> this length method is giving long datatype so convert it in int
		reader.read(ch);
		for(char c:ch) {
			System.out.println(c);
		}
		
}
		
	catch(Exception e) {
		System.out.println("Some Problem");
	}
	finally {
		reader.close();
	}
	
}
}
