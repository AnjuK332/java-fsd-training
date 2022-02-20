package training_java;
abstract class Google
{
 abstract void search();
 abstract void symbol();

 void message()
 { System.out.println("Thanku for using google");
 }
 }
class SearchAll extends Google
  {
     void search()
     {
         System.out.println("All Search results");
     }
void symbol()


  
     {
          System.out.println(" All Video results");
     }
}

public class AbstractClass {
	public static void main(String[] args)
    {
      Google a= new SearchAll();
       a.search();
      }
}


