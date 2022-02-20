package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashmapConstructor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> hm1 = new HashMap<>();
		 
	        // Add Elements using put method
	        hm1.put(1, "one");
	        hm1.put(2, "two");
	        hm1.put(3, "three");
	 
	        // Initialization of a HashMap
	        // using Generics
	        HashMap<Integer, String> hm2
	            = new HashMap<Integer, String>(hm1);
	 
	        System.out.println("Mappings of HashMap hm1 are : "
	                           + hm1);
	       
	        System.out.println("Mapping of HashMap hm2 are : "
	                           + hm2);
	    }
	
}
