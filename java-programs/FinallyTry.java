package training_java;

public class FinallyTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
		  {
		  int a=100/0;
		  System.out.println(a);    
		  }
		  catch(NullPointerException e)
		  {
		  System.out.println(e);
		  }
		  finally 
		  {
		  System.out.println("iam in finally block");
		  }
		     
		  }    
	}


