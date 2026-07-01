package IO_Operation;
import java.io.*;

public class LaunchIO5 {
public static void main(String[] args) throws IOException {
	String filePath3="D:\\personal\\college\\java by telusko\\IO\\src\\java.txt";
	FileWriter writer1=null;
	BufferedWriter bwriter=null;
	
	try {
		File file5=new File(filePath3);
		writer1=new FileWriter(file5,true);
		bwriter=new BufferedWriter(writer1);
		bwriter.write("Alien");
		bwriter.newLine();
		bwriter.write(90);//convert in corresponding character
		bwriter.newLine();
		char ch[]= {'j','a','v','a'};
		bwriter.write(ch);
		System.out.println("Open java.txt file in your hard disk");
		
}
		
	catch(Exception e) {
		System.out.println("Some Problem");
	}
	finally {
		bwriter.flush();//flush all the resources
		bwriter.close();
	}

}
}
