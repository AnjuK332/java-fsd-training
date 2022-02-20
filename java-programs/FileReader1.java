package training_java;
import java.io.FileReader;
public class FileReader1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        FileReader fr=new FileReader("D:testout.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    

	}


