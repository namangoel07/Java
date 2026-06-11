package LectureTwelvePointThree;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
//	ListIterator litr= a.listIterator();//same as Iterator but it has one advantage it can also print in reverse
//	
//	while(litr.hasNext()) {
//		System.out.println(litr.next());
//	}
	ListIterator litr=a.listIterator(a.size());//only used for list
	while(litr.hasPrevious()) {
		System.out.println(litr.previous());
	}
}
}
