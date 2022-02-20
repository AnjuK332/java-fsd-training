package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashmapRemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm
        = new HashMap<Integer, String>();

    // Add elements using put method
    hm.put(1, "Geeks");
    hm.put(2, "For");
    hm.put(3, "Geeks");
    hm.put(4, "For");

    // Initial HashMap
    System.out.println("Mappings of HashMap are : "
                       + hm);

    // remove element with a key
    // using remove method
    hm.remove(4);

    // Final HashMap
    System.out.println("Mappings after removal are : "
                       + hm);
     }
}


