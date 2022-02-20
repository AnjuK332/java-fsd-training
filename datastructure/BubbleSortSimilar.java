package training_java_datastructure;
import java.util.Scanner;
public class BubbleSortSimilar {
	public static void bubbleSort(int arr[],int len) {
	    int temp;
		 
		for (int i = 0; i < len-1; i++) 
			for (int j = 0; j < len-i-1; j++)
			{
				if (arr[j] > arr[j+1])
				{
				    temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				  System.out.println("");
			}
	}
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=0,j,sum=0,count=0;
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
	    
	    
	    for( int x=0;x<n;x++)
	         { for(int y=0;y<n;y++)
	               {if(arr1[x]==arr2[y])
                      {
	            	   arr3[count]=arr2[y];
	            	   count++;
                      }
	                }
           	}
	
	bubbleSort(arr3,count);
	System.out.println("Sorted array");
	for(int k=0;k<count;k++)
	{ 
		System.out.print(arr3[k]+",");
    }
  }
}
	
