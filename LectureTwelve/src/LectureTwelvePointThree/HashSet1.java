package LectureTwelvePointThree;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(100);
	hs.add(50);
	hs.add(150);
	hs.add(25);
	hs.add(75);
	hs.add(125);
	hs.add(175);
	hs.add(100);//not maintaining insertion order
	System.out.println(hs);//duplicates are not allowed 
	//family of sets will not allow duplicate
}
}
