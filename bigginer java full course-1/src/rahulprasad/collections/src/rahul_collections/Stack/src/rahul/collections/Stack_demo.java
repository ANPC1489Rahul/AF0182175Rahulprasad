package rahul.collections;
import java.util.Stack;
public class Stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		
		System.out.println("Original Stack: " + stack);
		
		String poppedElement=stack.pop();
		System.out.println("popped element: " + poppedElement);
		
		System.out.println("Now the stack looks like: " + stack);
		
		
		String poppedElement1=stack.peek();
		System.out.println("top element: " + poppedElement1);
		
		System.out.println("Now the stack looks like: " + stack);
		

	}

}
