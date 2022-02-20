package training_java_datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Double> q= new LinkedList<>();
//add
			q.add(1.1);
        	q.add(2.2);
        	q.add(3.3);
        System.out.println("Elements of queue q "+ q);
 //remove
        double removedele = q.remove();
       System.out.println("removed element-"+ removedele);
       System.out.println(q);
       double head = q.peek();
       System.out.println("head of q-" +head);
 //size
       int size = q.size();
       System.out.println("Size of queue-"+ size);
       
      Queue<Double> Q= new LinkedList<>(); 
//add
        	Q.add(4.4);
            Q.add(5.5);
        System.out.println("Elements of queue Q "+ Q);
 //add all
        Q.addAll(q) ;
        System.out.println("Elements of queue Q "+ Q);
 //clear
        q.clear();
        System.out.println("after clear elements-"+ q);
 //isEmpty
        boolean result=q.isEmpty();
        System.out.println("is queue empty-"+ result);
 //contains
        System.out.println("Does the queue contains '7.7'?-"+ q.contains(7.7));

	}

	

}
