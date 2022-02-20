package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashTableChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Double, Character> ht
        = new Hashtable<Double, Character>();

    
    ht.put(1.4, 'a');
    ht.put(2.2, 'a');
    ht.put(3.8, 'a');
    System.out.println("Initial Map " + ht);
      
     ht.put(2.2, 'b');
     System.out.println("Updated Map " + ht);
	}

}
