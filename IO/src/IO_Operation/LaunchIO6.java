package IO_Operation;
import java.io.*;
public class LaunchIO6 {
public static void main(String[] args) throws IOException {
	String filePath4="D:\\personal\\college\\java by telusko\\IO\\src\\java.txt";
	FileReader reader=null;
	BufferedReader breader=null;
	try {
		File file6=new File(filePath4);
		reader=new FileReader(file6);
		breader=new BufferedReader(reader);
		
		String str=breader.readLine();//reads all line once
		while(str!=null) {
			System.out.println(str);
			str=breader.readLine();//update to next line
		}
		
}
		
	catch(Exception e) {
		System.out.println("Some Problem");
	}
	finally {
		breader.close();
	
	}

}
}
