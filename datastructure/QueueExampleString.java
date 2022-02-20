package training_java_datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q= new LinkedList<>();
		
//add 
    	  q.add("red");
    	  q.add("green");
    	  q.add("blue");
    System.out.println("Elements of queue q "+ q);
    
 //remove
    String removedele = q.remove();
   System.out.println("removed element-"+ removedele);
   System.out.println(q);
   String head = q.peek();
   System.out.println("head of q-" +head);
   
 //size
   int size = q.size();
   System.out.println("Size of queue-"+ size);
   
 //add all
   Queue<String> Q= new LinkedList<>(); 
   
 //add
    	Q.add("black");
    	Q.add("white");
    System.out.println("Elements of queue Q "+ Q);
    Q.addAll(q) ;
    System.out.println("Elements of queue Q "+ Q);
    
 //clear
    q.clear();
    System.out.println("after clear elements-"+ q);
    
 //isEmpty
    boolean result=q.isEmpty();
    System.out.println("is queue empty-"+ result);
    
//contains
    System.out.println("Does the queue contains 'yellow'?-"+ q.contains("yellow"));

  }
}	


