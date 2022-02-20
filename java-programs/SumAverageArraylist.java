package training_java;
import java.util.*; 
public class SumAverageArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s= 0, avg;
	    
	    ArrayList<Integer> list = new ArrayList<Integer>();  
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);

	    for(int i = 0; i < list.size(); i++)
	        s+= list.get(i);
	    System.out.println(" The Sum is: " + s);
	    avg = s/ list.size(); 
	    System.out.println("The average is: " + avg);
	  }
	}


