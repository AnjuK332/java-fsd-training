package training_java_datastructure;
import java.util.*;
public class SelectionSortSumAscending {
	void sort(int arr3[]) {
		int n = arr3.length; 
for (int i = 0; i < n-1; i++) 
		{  
			int min = i;
			for (int j = i+1; j < n; j++) 
				{
				if (arr3[j] < arr3[min])
					min = j;
			    }
			int temp = arr3[min];
			arr3[min] = arr3[i];
			arr3[i] = temp;
		}
	}
 void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
	    System.out.println("Enter the size of the array");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int[] arr1 = new int[n];
	    int[] arr2 = new int[n];
	    int[] arr3 = new int[n];
	    System.out.println("Enter the elements of the array-1");
	    for(i=0;i<n;i++)
	    {
	      arr1[i]= sc.nextInt();
	    }
	    System.out.println("Enter the elemtns of the array-2");
	    for(i=0;i<n;i++)
	    {
	      arr2[i]= sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	      arr3[i]= arr1[i]+arr2[i];
	    }
	    System.out.println("The sum of elements of the array is:");
	    for(i=0;i<n;i++)
	    {
	      System.out.print(arr3[i]+",");
	    }
	    System.out.println(" ");
	    SelectionSorting ob = new SelectionSorting();
        ob.sort(arr3);
		System.out.println("Sorted array");
		ob.printArray(arr3);
	}
	  }
	


