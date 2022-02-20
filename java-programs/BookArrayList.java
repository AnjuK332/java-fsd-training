package training_java;
import java.util.*;

public class BookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Books> arrList = new ArrayList<Books>();
				
				arrList.add(new Books(2015,"Into the wild","Arun",12));
				arrList.add(new Books(2004,"Roads & Mountains","Varshit",6));
				arrList.add(new Books(2020,"Scientific Football","Sayed",10));
				arrList.add(new Books(1998,"Guns & Roses","Lilwayne",20));
				for(Books str1: arrList)
				{
					System.out.println(str1.yop + " " +str1.name +" "+str1.author+" "+str1.qty);
				}
				System.out.println();
				Collections.sort(arrList, new yopComparator() );
				for(Books str: arrList)
				{
					System.out.println(str.yop + " " +str.name +" "+str.author+" "+str.qty);
				}
			}
		}
		class Books
		{  
			int yop;  
			String name,author;  
			int qty;  
			public Books(int yop, String name, String author, int qty) 
			{  
		    this.yop = yop;  
		    this.name = name;  
		    this.author = author;  
		    this.qty = qty;  
			}  
		}
		class yopComparator implements Comparator<Books>
		{
			public int compare(Books b1, Books b2)
			{
				if(b1.yop == b2.yop)
					return 0;
				else if(b1.yop > b2.yop)
					return 1;
				else
					return -1;
			}
	}


