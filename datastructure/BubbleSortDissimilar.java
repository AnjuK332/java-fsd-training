package training_java_datastructure;

import java.util.Scanner;

public class BubbleSortDissimilar {
	void bubbleSort(int arr3[]) {
		
		int n = arr3.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++)
			{//j=1, j+1=2, n-i-1= 7-5-1=1
				if (arr3[j] > arr3[j+1])
				{   int temp = arr3[j];
					arr3[j] = arr3[j+1];
					arr3[j+1] = temp;
				}
			      System.out.println("");
			}
	}
  void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,sum=0;
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
	    System.out.println("The array of disimilar elements is:");
	    for( i=0;i<arr1.length;i++)
	         { for(j=0;j<arr2.length;j++)
	               {if(arr1[i]!=arr2[j])
                      {arr3[j]=arr2[j];
	            	   System.out.print(arr2[j]+",");
                      }
	               }
           	}
	   System.out.println(" ");
	BubbleSorting ob = new BubbleSorting();
	ob.bubbleSort(arr3);
	System.out.println("Sorted array");
	ob.printArray(arr3);

	}
}

