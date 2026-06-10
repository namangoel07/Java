package LectureTwelvePointTwo;

import java.util.LinkedList;

public class Linkedlist1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
    l1.add(10);
    l1.add("Java");
    l1.add("Bangaluru");
    l1.add(0, 2);
    l1.addFirst(30);
    l1.addLast(1);
    System.out.println(l1);
    l1.offer("Devops");//adding at rear end
    System.out.println(l1);
    l1.offerFirst("SB");
    l1.offer("Devops");//duplicate allowed
    System.out.println(l1);//offer is same as add but in offer it might get added and might not
    System.out.println(l1.peek());//element at first in this SB
    System.out.println(l1);//Sb is still part of collection
    System.out.println(l1.poll());//it also gives first element
    System.out.println(l1);//but remove SB from collection
    System.out.println(l1.peek());//now 30 is at first
}
}
