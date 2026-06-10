package LectureTwelvePointTwo;

import java.util.ArrayList;

public class Arraylist1 {
public static void main(String[] args) {
	  ArrayList a1=new ArrayList();
      a1.add(100);//everything is stored as object
      a1.add(45.5);
      a1.add("Sachin");
      a1.add(true);
     // System.out.println(a1);
      ArrayList a2=new ArrayList();
      a2.add(10);
      a2.add(20);
      a2.add(0, 1);
      a2.addAll(a1);
      a2.add(10);//duplicate allowed
      System.out.println(a2);
      System.out.println(a2.contains(20));
      System.out.println(a2.containsAll(a1));
      

}
}
