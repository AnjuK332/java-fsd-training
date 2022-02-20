package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Double, String> ht1 = new Hashtable<>(4);
	     Hashtable<Double, String> ht2 = new Hashtable<Double, String>(2);
	           
	        ht1.put(1.1, "one");
	        ht1.put(2.2, "two");
	        ht1.put(3.3, "three");
	  
	        ht2.put(4.4, "four");
	        ht2.put(5.5, "five");
	        ht2.put(6.6, "six");
	  
	        System.out.println("Mappings of ht1 : " + ht1);
	        System.out.println("Mappings of ht2 : " + ht2);
	    }
	

}
