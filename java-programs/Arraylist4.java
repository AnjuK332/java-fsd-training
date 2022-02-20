package training_java;
import java.util.*;
public class Arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		System.out.println(sample.get(3));
		sample.set(2,"Renault");
		for(String car:sample)
		{
			System.out.println(car);
		}
	}
}


