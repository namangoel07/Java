package LectureTwelvePointTwo;

import java.util.TreeSet;

public class Treeset1 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	//insertion by index is not allowed
	ts.add(100);
	ts.add(50);
	ts.add(150);
	ts.add(25);
	ts.add(75);
	ts.add(125);
	ts.add(175);
	ts.add(100);//duplicate is not allowed and is ignored
	System.out.println(ts);
	
}
}
