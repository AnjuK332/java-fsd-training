package training_java_datastructure;

public class FirstTenPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n,a,i,rev=0;
   System.out.println("first 10 natural pallindrome numbers is:");
   for( i=11; i<=101; i++)
   {   n= i;
	   while(n>0)
	   {
		   a=n%10;
		   rev=rev*10+a;
		   n=n/10;
	   }
	   if(rev==i)
	   {
		   System.out.println(i + " ");
	   }
	   rev=0;
	 }
  }
}
