package LectureTwelvePointSix;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

interface Alpha{
	interface Beta{
		static void disp() {
			System.out.println("Static method of an inner interface");
		}
	}
}
public class Map2 {
public static void main(String[] args) {
	Alpha.Beta.disp();
	HashMap<Integer,String> hm1=new HashMap<>();
	hm1.put(1, "Java");
	hm1.put(2, "Dsa");
	hm1.put(3, "SpringBoot");
	System.out.println(hm1);
	String data=hm1.get(3);
	System.out.println(data);
	Collection<String> values=hm1.values();
	Iterator<String> itr=values.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("********************");
	Set<Integer> keys=hm1.keySet();
	Iterator<Integer> itr2=keys.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	System.out.println("********************");
	Set entry=hm1.entrySet();
	Iterator itr3=entry.iterator();
	while(itr3.hasNext()) {
		  Map.Entry pair=(Entry) itr3.next();
		  System.out.println("Key:"+pair.getKey()+" Value:"+pair.getValue());
	}
	
}
}
