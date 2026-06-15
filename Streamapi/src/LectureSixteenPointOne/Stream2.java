package LectureSixteenPointOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(55);
	list.add(54);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(list);
//	Collections.sort(list);//sorting but effecting original data
//	System.out.println(list);
	
	
//	Stream<Integer> streamdata=list.stream();//only use to perform one operation only
//	Stream<Integer> sortedStream=streamdata.sorted();//every time making new stream to large code
	//sortedStream.forEach((n)->System.out.println(n));
	
	
//	Stream<Integer> streamdata2=streamdata.map(n->n*2);
//	streamdata2.forEach(n->System.out.println(n));//output->stream has already been operated upon or closed
	
	
//	Stream<Object> streamdata2=sortedStream.map(n->n*2);
//	streamdata2.forEach(n->System.out.println(n));

	list.stream()
	.sorted()
	.map(n->n*2)
	.forEach(n->System.out.println(n));//simple writing 
	
	String n="ALIEN";
	int length=n.toLowerCase().toUpperCase().concat("Java").length();//method chaining
	
}
}
