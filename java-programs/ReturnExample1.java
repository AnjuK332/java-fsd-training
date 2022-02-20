package training_java;
import java.util.*;
public class ReturnExample1 {
	public static int add(int x,int y)
	{      return  x+y;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter 2 numbers");
int a,b,result;
a=s.nextInt();
b=s.nextInt();
 result=add(a,b);
 System.out.println("Sum="+result);
	}
}


