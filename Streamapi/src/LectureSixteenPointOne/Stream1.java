package LectureSixteenPointOne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Stream1 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(55);
	list.add(54);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(list);
//	for(Integer i:list) {
//		int res=i*2;
//		System.out.println(res);
//	}
//	System.out.println(list);
	//-----------------------------------
//	Consumer<Integer> con=new Consumer<>() {
//		@Override
//		public void accept(Integer n) {
//			System.out.println(n);
//		}
//	};
	//Consumer<Integer> con=(Integer n)->System.out.println(n);//lambda
	list.forEach((n)->System.out.println(n));//direct lambda
}
}
