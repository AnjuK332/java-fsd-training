package training_java;
import java.util.*;

public class FirstnameLastnameArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Firstname=new ArrayList<String>();
        ArrayList<String> Lastname=new ArrayList<String>();
        ArrayList<String> Fullname=new ArrayList<String>();

Firstname.add("Rahul");

Firstname.add("Ramesh");

Firstname.add("Rohan");

Lastname.add("James");
Lastname.add("George");
Lastname.add("Ashok");

for(int i=0;i<Firstname.size();i++)
{
Fullname.add(Firstname.get(i)+" "+Lastname.get(i));
}
System.out.println("Fullname");
System.out.println();
for(String i:Fullname)
{
System.out.println(i);
}
}
	}


