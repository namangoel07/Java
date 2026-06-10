package LectureTwelvePointTwo;

import java.util.PriorityQueue;

public class Priorityqueue1 {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(100);
	pq.add(50);
	pq.add(150);
	pq.add(25);
	pq.add(75);
	pq.add(125);
	pq.add(175);
	pq.add(100);//duplicates are allowed 
	 System.out.println(pq);//not maintaining order of insertion 
}
}
