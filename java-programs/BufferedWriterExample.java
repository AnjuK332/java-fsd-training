package training_java;
import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 FileWriter writer = new FileWriter("D:testout.txt");  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write("Hello Goodmorning");  
		    buffer.close();  
		    System.out.println("Morning");  
		    }  
}


