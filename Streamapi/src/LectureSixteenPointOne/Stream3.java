package LectureSixteenPointOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream3 {
public static void main(String[] args) {
	List<String> list2=new ArrayList<>();
	list2.add("Maven");
	list2.add("SQL");
	list2.add("Java");

	System.out.println(list2);
	Set<String> set=list2.stream().collect(Collectors.toSet());
	List<String> list3=list2.stream().sorted().collect(Collectors.toList());
	System.out.println(list3);//stream is only for collections
}
}
