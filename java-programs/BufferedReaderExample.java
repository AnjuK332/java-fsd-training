package training_java;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	      FileReader fr=new FileReader("D:testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
} 
	


