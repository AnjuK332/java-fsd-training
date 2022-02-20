package training_java;

public class Variables {
	int instant;
	static int staticv=1;

	
	public static void main(String[] args) {
            int x=2;
	        System.out.println("Value of static variable is: "+staticv);
		    System.out.println("Value of local variable x: "+x);
		    }
	
	public void display() 
	{
		System.out.println("Value of instance variable is: "+instant);
	} 
}
 



