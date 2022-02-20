package training_java;

public class Throw {
	
	    static void funcn1()
	    {
	        try
	        {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("function 1 body");
	            throw e;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
	        {
	            funcn1();
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("main body");
	        }
	    }
	}


