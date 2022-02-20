package training_java;
import java.util.*;

public class Exam {
	public static void main(String[] args)

    {
        Scanner s=new Scanner(System.in);


         System.out.println(" Enter the number of classes held");

         int x=s.nextInt();

         System.out.println(" Enter the number of class you attended");

         int a=s.nextInt();

         float percentage = (a*100)/x;

         System.out.println("Your percentage of attendence is:" +percentage);
         
         if(percentage<75)
                 
              {   
                  System.out.println( " you can't attend the exam");
              }

         else
              {  
                  System.out.println(" you can attend the exam");
              }
      }

}
