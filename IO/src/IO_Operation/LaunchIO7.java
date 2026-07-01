package IO_Operation;
import java.io.*;
public class LaunchIO7 {
public static void main(String[] args) throws IOException {
	String filePath5="D:\\personal\\college\\java by telusko\\IO\\src\\java.txt";
	FileWriter writer2=null;
	PrintWriter pwriter=null;
	
	try {
		File file7=new File(filePath5);
		writer2=new FileWriter(file7,true);//last saved method also seen due to true
		pwriter=new PrintWriter(writer2);
		pwriter.write(90);//convert in corresponding character
		pwriter.write("\n");
		pwriter.println("JAVA");
		pwriter.println('A');
		pwriter.println(true);
		pwriter.println(90.5);
		pwriter.println(90);
		
}
		
	catch(Exception e) {
		System.out.println("Some Problem");
	}
	finally {
	
		pwriter.close();
	}

}
}
