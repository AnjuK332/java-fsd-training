package training_java;

public class BreakExample1 {

	public static void main(String[] args) {
		int i,j;
		// TODO Auto-generated method stub
for( i=1;i<=3;i++)
     {    for(j=1;j<=3;j++)
            { 
    	        if(i==2&&j==2)
	            break;
	        }
System.out.println(i+","+j);
     }
  }
}

