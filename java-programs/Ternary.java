package training_java;

public class Ternary {
	public static void main(String[] args)
    {
         int a=10, b=12, c=3, g, s ;

         g=(a>b)?(a>c?a:c):(b>c?b:c);
         s=(a<b)?(a<c?a:c):(b<c?b:c);

         System.out.println("greater is" +g);
         
         System.out.println("Smaller is" +s);
    }
}


