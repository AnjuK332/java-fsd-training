package training_java_datastructure;

import java.util.Stack;

public class StackSampleDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an instance of Stack class  
				Stack<Double> stk= new Stack<>();  
				// checking stack is empty or not  
				boolean result = stk.empty();  
				System.out.println("Is the stack empty? " + result);  
				// pushing elements into stack  
				stk.push(18.2);  
				stk.push(73.4);  
				stk.push(80.6);  
				stk.push(20.7);  
				//prints elements of the stack  
				System.out.println("Elements in Stack: " + stk);  
				result = stk.empty(); 
				stk.pop();
				System.out.println("The last elementis:"+stk.peek());
				System.out.println("The position of 73.4 in the stack is:" +stk.search(73.4));  
				}
	}


