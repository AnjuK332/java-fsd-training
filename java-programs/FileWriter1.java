package training_java;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriter1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String str = " file Writer example";

		FileWriter fw = new FileWriter("D:FileWriter1.txt");

		for (int i = 0; i < str.length(); i++)
		fw.write(str.charAt(i));

		System.out.println("File Writing completed.");
		fw.close();
	}
}


