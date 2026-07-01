package IO_Operation;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private int id;
	private String name;
	private int age;
	public Student(int id,String name,int age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void disp() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
public class LaunchIo8 {
public static void main(String[] args) {
	        Student stu1=new Student(1,"Yash",17);
	        stu1.disp();
	        try {
				FileOutputStream fos=new FileOutputStream("D:\\personal\\college\\java by telusko\\IO\\src\\serial.txt");
				BufferedOutputStream bos=new BufferedOutputStream(fos);
				ObjectOutputStream oos=new ObjectOutputStream(bos);
	
				oos.writeObject(stu1);
				System.out.println("Please check the file to see serialzed object");
				
				oos.close();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        
}
}
