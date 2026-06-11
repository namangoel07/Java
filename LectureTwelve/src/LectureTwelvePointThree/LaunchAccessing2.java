package LectureTwelvePointThree;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchAccessing2 {
public static void main(String[] args) {
	CopyOnWriteArrayList a=new CopyOnWriteArrayList();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
	Iterator itr=a.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		a.add(91);
	}
}
}
