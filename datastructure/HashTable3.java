package training_java_datastructure;
import java.util.*;
import java.io.*;
public class HashTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Character> ht1= new Hashtable<>(4, 0.75f);

	Hashtable<Integer, Character> ht2= new Hashtable<Integer, Character>(3, 0.5f);

    ht1.put(1, 'p');
    ht1.put(2, 'q');
    ht1.put(3,'r');

    ht2.put(4, 's');
    ht2.put(5, 't');
    ht2.put(6, 'u');
    System.out.println("Mappings of ht1 : " + ht1);
    System.out.println("Mappings of ht2 : " + ht2);
	}

}
