package training_java_datastructure;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,x=0,y=0,z=1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:");
    n=s.nextInt();
    System.out.println("Fibonacci series is:");
    for(int i=1;i<=n;i++)
    {
    	x=y;
    	y=z;
        z=x+y;
      System.out.print(x+" ");
    }
	}

}
