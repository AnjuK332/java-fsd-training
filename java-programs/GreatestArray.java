package training_java;
import java.util.*;

public class GreatestArray {
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	int a []=new int[n];
	System.out.println("Enter the elements of array");
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	int big=a[0];
	for(int i=0;i<n;i++)
	{
	if(big<a[i])
	{
	big=a[i];
	}
	}
	System.out.println("Biggest Element in the Array="+big);
	}
}
