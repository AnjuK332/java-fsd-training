package training_java_datastructure;
import java.util.*;
public class CollectionArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
	}

}
