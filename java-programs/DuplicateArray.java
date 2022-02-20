package training_java;
import java.util.*;

public class DuplicateArray {
	public static void main(String[] args)

	{ Scanner sc=new Scanner(System.in);

	 System.out.println("enter the size of  array");

	   int size=sc.nextInt();
	   int[] arr=new int[size];

	 System.out.println("enter the array elements");


	 for(int i=0; i<size;i++)

	 {  arr[i]=sc.nextInt();

	  }

	  System.out.println("The duplicate array elements are");

	  for(int i=0; i<size;i++)

	     {  
	      for(int j=i+1; j<size; j++)

	  

	       {     if (arr[i]==arr[j])

	       System.out.println(arr[j]);

	       }

	      }
	}

}
