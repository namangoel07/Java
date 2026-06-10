package LectureTwelvePointTwo;

import java.util.ArrayDeque;

public class Arraydequeue1 {
public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque();
	ad.add(10);
	ad.add(20);
	ad.add(30);
	ad.add(10);//duplicate allowed
	 System.out.println(ad);//maintaining order of insertion
}
}
