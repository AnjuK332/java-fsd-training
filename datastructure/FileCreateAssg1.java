package training_java_datastructure;
import java.io.FileWriter;
public class FileCreateAssg1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   String s="Creating a sample file" +"for writing a content";
   FileWriter f=new FileWriter("D:AssignmentFileCreate.txt");
   for(int i=0;i<s.length();i++)
	{
		f.write(s.charAt(i));
	}
	System.out.println("Writing completed succesfully");
	f.close();
 }	
}


