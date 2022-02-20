package training_java;
import java.io.File;
import java.util.*;
public class ScannerRead {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 File file = new File("D:testout.txt");
	    Scanner sc = new Scanner(file);
	    StringBuffer sb = new StringBuffer();
	    while(sc.hasNext()) {
	         sb.append(" "+sc.nextLine());
	      }
	      System.out.println(sb);
	   }
	}


