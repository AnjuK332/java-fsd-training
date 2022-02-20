package training_java_datastructure;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		 pq.add(3);
		 pq.add(2);
		 pq.add(1);
		 pq.add(5);
		
		
		 System.out.println("Elements of queue pq "+ pq);
		 System.out.println("head of queue pq "+ pq.peek());
		 System.out.println("size of queue p "+ pq.size());
		 boolean removed=pq.remove(1);
		 System.out.println("removed");
		 pq.poll();
		 System.out.println("priority queue is:"+pq);
		 System.out.println("is priority queue empty?"+pq.isEmpty());
		 	}
	}


