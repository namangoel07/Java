package LectureFifteenPointFive;

import java.io.BufferedWriter;
import java.io.FileWriter;
class Alien implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("Close method of Alien");
	}
}
public class TryWithResources {
public static void main(String[] args) throws Exception {
	//normal try catch

//	BufferedWriter writer=null;
//	try {
//		  writer=new BufferedWriter(new FileWriter("D:\\Telusko\\java.txt"));
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
//	finally {
//		writer.close();
//	}
	
	
	try(Alien alien=new Alien()){//The resource type Alien does not implement java.lang.AutoCloseable
		
	}
//try with resources-> in try only whether exception occur or not occur it will lose the resource automatically
	
	try (BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Telusko\\java.txt"))){
		 
	}// in try with resources we can also have only try but exception will not be handled if occur
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
