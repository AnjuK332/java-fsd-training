package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashTable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Double, Character> hm = new HashMap<>();
		  
	        hm.put(1.4, 'r');
	        hm.put(2.7, 'g');
	        hm.put(3.2, 'h');
	  
	       Hashtable<Double, Character> ht2  = new Hashtable<Double, Character>(hm);
	          
	        System.out.println("Mappings of ht2 : " + ht2);
	    }
	

}
