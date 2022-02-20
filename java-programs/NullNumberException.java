package training_java;
public class NullNumberException {
	public static void main(String[] args) {
		 
        String ptr= null;

        try {  
             int a=Integer.parseInt(null);
             System.out.println("Outer try-catch block");
 
            try {

                 if (ptr.equals("gfg"))

                 System.out.println("same");

                 else

                 System.out.println("not same");
                }

            catch(NullPointerException e) {

                System.out.println("Nullpointer exception caught" );
            }
        }
        catch(NumberFormatException e) {
         
            System.out.println("Number format exception caught");
        }
    }

}
