package training_java_datastructure;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,f,l,t=0,temp;
    System.out.println("Enter a number:");
    Scanner s =new Scanner(System.in);
    n=s.nextInt();
    temp=n;
   
    while(n!=0)
    {i=1;
     f=1;
     l=n%10;
    while(i<=l)
    {
    	f=f*i;
    	i++;
    }
    t=t+f;
    n=n/10;
    }
    if(t==temp)
    System.out.println(temp+ " is a strong number");
    else
    System.out.println(temp+ " is not a strong number");
    System.out.println();
    }
    
}


