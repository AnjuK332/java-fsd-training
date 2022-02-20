package training_java;
import java.io.FileWriter;
import java.io.IOException;
public class FileCreate {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String st="This is just some sample content"+" for writing into a file ";
		FileWriter f=new FileWriter("D:SampleOutputWriter.txt");
		for(int i=0;i<st.length();i++)
		{
			f.write(st.charAt(i));
		}
		System.out.println("Finished writing");
		f.close();
	}
	}


