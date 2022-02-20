//program to implement all methods of fileWrite
package training_java_datastructure;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileWriterAssg1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       String str="file writing";
    try {
    	FileWriter fw=new FileWriter("D:AssignmentFileCreate.txt");
    	for(int i=0;i<str.length();i++)
    		fw.write(str.charAt(i));
    	    fw.write("\n");
    	char[] arr= {'a','b','c','d','e'};
   	 fw.write(arr);
   	 fw.write("\n)");
   	 fw.write(arr,1,3);
   	 fw.write("\n");
   	 fw.append("java program");
   	 fw.write("\n");
   	 fw.append(str,1,4);
   	 fw.write("\n");
   	 fw.write('z');
   	 fw.write("\n");
   	 
    	System.out.println("Successfully written");
    	fw.flush();
    	fw.close();
    }
       catch (Exception e)
       {
    	   e.getStackTrace();
       }
	}
}
	 


