package training_java_datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Character> q= new LinkedList<>();
		
//add
        	q.add('a');
        	q.add('b');
        	q.add('c');
        System.out.println("Elements of queue q "+ q);
 //remove
        char removedele = q.remove();
       System.out.println("removed element-"+ removedele);
       System.out.println(q);
       char head = q.peek();
       System.out.println("head of q-" +head);
 //size
       int size = q.size();
       System.out.println("Size of queue-"+ size);
 //add()
       q.add('x');
       q.add('z');
 
       Queue<Character> Q= new LinkedList<>(); 
 //add
        	Q.add('i');
        	Q.add('j');
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
        System.out.println("Does the queue contains 'm'?-"+ q.contains('m'));

	}

	}


