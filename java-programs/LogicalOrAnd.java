package training_java;

public class LogicalOrAnd {
    public static void main(String[] args)
    {
     
     int a = 6, b = 12, c = 3, d = 0;

     
     System.out.println("Num1 = " + a);
     System.out.println("Num2 = " + b);
     System.out.println("Num3 = " + c);

     
     
     if ((a == b) && ( c>b)) 
     { 
         if((a==b) || (c < d))
        {
         d = a + b + c;
         System.out.println("sum is " + d);
        }
        else
        {
         System.out.println("Or condition id false");
         }
     }
     else
     {
        System.out.println("Both conditions are false");
      }
}
}


