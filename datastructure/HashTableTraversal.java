package training_java_datastructure;
import java.util.Hashtable;
import java.util.Map;
public class HashTableTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Character, Double> ht = new Hashtable<>();
		  
        
      ht.put('a', 10.1);
      ht.put('b', 30.3);
      ht.put('c', 20.8);
    
        // Iterating using enhanced for loop
      for (Map.Entry<Character, Double> e : ht.entrySet())
          System.out.println(e.getKey() + " "+ e.getValue());
                             
	}

}
