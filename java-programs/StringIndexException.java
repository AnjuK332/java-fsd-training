package training_java;

public class StringIndexException {
	public static void main(String[] args) {

	       String s= "Reading Books" ;

	       try{
	        
	        s.charAt(15);

	       System.out.println("string index is valid");

	           } 
	       catch( StringIndexOutOfBoundsException e)

	       { 
	         System.out.println("String index is out of bounds");
	       }
	    }

}
