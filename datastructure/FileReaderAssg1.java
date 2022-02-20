//program to implement all methods of fileRead
package training_java_datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class FileReaderAssg1 {
public static void main(String[] args)throws Exception {
	   // TODO Auto-generated method stub
		FileReader fr=new FileReader("D:AssignmentFileCreate.txt");    
        /*int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i); 
        System.out.println("Successfully written");*/
		int i;
        BufferedReader br=new BufferedReader(fr);    
        while((i=br.read())!=-1)
        {  
        System.out.print((char)i);
        }  
        br.close();   
        Scanner sc = new Scanner(fr);
	    StringBuffer sb = new StringBuffer();
	    while(sc.hasNext())
	    {
	         sb.append(" "+sc.nextLine());
	    }
	      System.out.println(sb);
	      fr.close();
       }
	}


