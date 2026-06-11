package LectureTwelvePointFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Launch1 {
 public static void main(String[] args) {
	 List<Integer> list=new ArrayList<>();
	 //List<Integer> list1=new LinkedList<>();//but not every method can be used as LInkedList also show dequeue
	 List<Integer> l=Arrays.asList(10,20,30,40);
	 
 }
 public static Iterable<Integer> getInteger(){
	 //return new ArrayList<Integer>();
	 return new TreeSet<Integer>();//anything of collection as iterable is parent of all collection
 }
 public static List<Integer> getIntegers(){
	 return new ArrayList<Integer>();
	 //return new TreeSet<Integer>();//error as only list type can be used
 }
 
}
