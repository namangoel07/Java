package IO_Operation;
import java.io.*;
public class LaunchIO1 {
public static void main(String[] args) 
{
	//File file=new File("D:\\personal\\college\\java by telusko\\IO\\src\\java.txt");//if it is already there then file will start referring to it
	//System.out.println(file.exists());//false
     try {
//		System.out.println(file.createNewFile());//true
//		System.out.println(file.exists());
    	 
    File dir=new File("D:\\personal\\college\\java by telusko\\IO\\src\\Dir");
    System.out.println(dir.exists());
    dir.mkdir();//creating folder 
    System.out.println(dir.exists());
    	 
	} 
     
     catch (Exception e) {
		System.out.println("Some Problem");
	}
	
}
}
