package LectureTwelvePointThree;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add(100);
	hs.add(50);
	hs.add(150);
	hs.add(25);
	hs.add(75);
	hs.add(125);
	hs.add(175);
	hs.add(100);//it maintains order of insertion else everything same as hashset
	System.out.println(hs);//duplicates are not allowed
}
}
