package IO_Operation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	private int id;
	private String name;
	private int age;
	public Student1(int id,String name,int age) {
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
public class LaunchIO9 {
public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("D:\\personal\\college\\java by telusko\\IO\\src\\serial.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Student1 st=(Student1)ois.readObject();
		st.disp();
		
		ois.close();
		fis.close();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}
}
