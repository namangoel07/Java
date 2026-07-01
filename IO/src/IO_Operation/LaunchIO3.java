package IO_Operation;
import java.io.*;
public class LaunchIO3 {
public static void main(String[] args) throws IOException {
	String filePath1="D:\\personal\\college\\java by telusko\\IO\\src\\java.txt";
	FileWriter writer=null;
	try {
		File file3=new File(filePath1);
		writer=new FileWriter(file3,true);//now after true it will not override anything it will write again everything with changes
		
		writer.write("Java");
		writer.write("\n");//without this everything is in same line
		writer.write(90);
		writer.write("\n");
		writer.write(97);//will be stored in the corresponding alphabet
		writer.write("\n");
		
		char ch[]= {'a','l','i','e'};
		writer.write(ch);
		writer.write("\n");
		
		
		
	}
	catch(Exception e) {
		System.out.println("Some Problem");
	}
	finally {
		writer.close();//as null can also be there so we have to surround it in try/catch or throws IOEXception
	}
	
}
}
