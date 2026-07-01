package IO_Operation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student2 implements Serializable{
	private int id;
	private String name;
	transient private int age;//not part of serialization
	public Student2(int id,String name,int age) {
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
public class LaunchIO10 {
public static void main(String[] args) {
//	Student2 stu2=new Student2(1,"Yash",17);
//    stu2.disp();
    try {
//		FileOutputStream fos=new FileOutputStream("D:\\personal\\college\\java by telusko\\IO\\src\\serial.txt");
//		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		ObjectOutputStream oos=new ObjectOutputStream(bos);
//
//		oos.writeObject(stu2);
//		System.out.println("Please check the file to see serialzed object");
//		
//		oos.close();
//		fos.close();
    	
    	
    	FileInputStream fis=new FileInputStream("D:\\personal\\college\\java by telusko\\IO\\src\\serial.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Student2 st=(Student2)ois.readObject();
		st.disp();
		
		ois.close();
		fis.close();
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

}
}
