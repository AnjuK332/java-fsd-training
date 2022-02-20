package training_java_datastructure;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		
		 for (int i = 0; i < 5; i++)
         	q.add(i);
         System.out.println("Elements of queue q "+ q);
         //remove
         int removedele = q.remove();
        System.out.println("removed element-"+ removedele);
        System.out.println(q);
        int head = q.peek();
        System.out.println("head of q-" +head);
        //size
        int size = q.size();
        System.out.println("Size of queue-"+ size);
        //add()
        q.add(6);
        q.add(7);
        //add all
        Queue<Integer> Q= new LinkedList<>(); 
        for (int i = 10; i < 15; i++)
         	Q.add(i);
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
         System.out.println("Does the queue contains '1'?-"+ q.contains("1"));

	}

}
