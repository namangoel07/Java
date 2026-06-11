package LectureTwelvePointThree;

import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(100);
	ts.add(50);
	ts.add(150);
	ts.add(25);
	ts.add(75);
	ts.add(125);
	ts.add(175);
	ts.add(100);//duplicate is not allowed and is ignored
	System.out.println(ts);
	//System.out.println(ts.ceiling(50));//50 as 50 is present
	System.out.println(ts.ceiling(65));//it gives higher value only if 65 is not present else give 65
	System.out.println(ts.higher(65));//it gives higher value then 65
	//System.out.println(ts.floor(50));//50 as 50 is present
	System.out.println(ts.floor(45));//it gives lower value only if 45 is not present else give 45
	System.out.println(ts.lower(45));//it gives lover value then 45
	
	//---------------------
	System.out.println(ts.tailSet(75));//[75, 100, 125, 150, 175]
	System.out.println(ts.headSet(75));//[25, 50]
	
	
	
	
	
}
}
