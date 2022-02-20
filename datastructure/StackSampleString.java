package training_java_datastructure;

import java.util.Stack;

public class StackSampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an instance of Stack class  
				Stack<String> stk= new Stack<>();  
				// checking stack is empty or not  
				boolean result = stk.empty();  
				System.out.println("Is the stack empty? " + result);  
				// pushing elements into stack  
				stk.push("apple");  
				stk.push("mango");  
				stk.push("grapes");  
				stk.push("orange");  
				//prints elements of the stack  
				System.out.println("Elements in Stack: " + stk);  
				result = stk.empty(); 
				stk.pop();
				System.out.println("The last elementis:"+stk.peek());
				System.out.println("The position of mango in the stack is:" +stk.search("mango"));  
	}

}
