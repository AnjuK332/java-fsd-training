package training_java_datastructure;
import java.util.*;
public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n,a=0,b;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number:");
     n=s.nextInt();
     while(n!=0)
       {
    	 b=n%10;
    	 
          if(b==0)
    	      a++;
              n=n/10;
     }
     if(a>0)
    	 System.out.println("Given number is a duck number");
     else
    	 System.out.println("Given number is not a duck number"); 
	}

}
