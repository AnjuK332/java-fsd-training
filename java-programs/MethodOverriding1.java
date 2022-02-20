package training_java;
class Language
{     void pen()
       {  
          System.out.println("Reading");
       }
}
class English extends Language
{     void pen()
       {
          System.out.println("writting");
       }
}

public class MethodOverriding1 {
    public static void main(String[] args)
    {
       Language l=new English();
       English e=new English();
       Language s=new Language();
       l.pen();
       e.pen();
       s.pen();
    }
}


