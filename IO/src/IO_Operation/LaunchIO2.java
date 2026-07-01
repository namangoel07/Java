package IO_Operation;
import java.io.*;
public class LaunchIO2 {
public static void main(String[] args) {
	String filePath="D:\\personal\\college\\java by telusko\\IO\\src\\java.txt";
	String dirPath="D:\\personal\\college\\java by telusko\\IO\\src\\Dir";
	File file1=new File(filePath);
	System.out.println(file1.getPath());
	System.out.println(file1.isDirectory());
	System.out.println(file1.isFile());
	File dir1=new File(dirPath);
	System.out.println(dir1.getPath());
	System.out.println(dir1.isDirectory());
	System.out.println(dir1.isFile());
	
	
	File file2=new File("D:\\personal\\college\\java by telusko\\IO\\src");
	String str[]=file2.list();
	int count=0;
	for(String names:str) {
		count++;
		System.out.println(names);
	}
	System.out.println("The no. of files on the path are:"+count);
	
}
}
