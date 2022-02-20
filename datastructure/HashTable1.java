package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Character> ht1 = new Hashtable<>();
	    Hashtable<Integer, Character> ht2 = new Hashtable<Integer, Character>();
        
        ht1.put(1, 'a');
        ht1.put(2, 'b');
        ht1.put(3, 'c');
  
        ht2.put(4, 'x');
        ht2.put(5, 'y');
        ht2.put(6, 'z');
  
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    
	}

}
