package training_java_datastructure;
import java.util.Stack;
public class StackSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		//creating an instance of Stack class  
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty(); 
		stk.pop();
		System.out.println("The last elementis:"+stk.peek());
		System.out.println("The position of 113 in the stack is:" +stk.search(113));  
		}

	}


