package Week7;

public class Driver {

	public static void main(String[] args) {
		// 1.1 Create an instance of an ArrayStack class.
		ArrayStack stack1 = new ArrayStack();
		// 1.2 Push ints into stack1.
		stack1.push(1);
		stack1.push(7);
		stack1.push(3);
		stack1.push(4);
		stack1.push(9);
		stack1.push(2);
		// 1.3 Pop off all the elements from the stacks, displaying each int as it's removed.
		System.out.println("The size of the stack1 is: " + stack1.size());
		while (!stack1.isEmpty()) {
			System.out.print(stack1.peek() + " ");
			stack1.pop();
		}
		System.out.println();
		
		// 2.1 Create an instance of an LinkedStack class.
		LinkedStack stack2 = new LinkedStack();
		// 2.2 Push ints into stack2.
		stack2.push(1);
		stack2.push(7);
		stack2.push(3);
		stack2.push(4);
		stack2.push(9);
		stack2.push(2);
		// 2.3 Pop off all the elements from the stacks, displaying each int as it's removed.
		System.out.println("\n" + "The size of the stack2 is: " + stack2.size());
		while (!stack2.isEmpty()) {
			System.out.print(stack2.peek() + " ");
			stack2.pop();
		}
		System.out.println();
		
		// 3. Test removeBottomHalf method in LinkedStack class.
		LinkedStack stack3 = new LinkedStack();
		// Case 1. when the stack is empty.
//		stack3.removeBottomHalf(stack3);
//		System.out.println("The top half of the stack is: " + "\n" + stack3);
		
		// Case 2. when the stack has only 1 element.
//		stack3.push(1);
//		stack3.removeBottomHalf(stack3);
//		System.out.println("The top half of the stack is: " + "\n" + stack3);
		
		// Case 3. when the stack has more than 1 element.
		stack3.push(1);
		stack3.push(7);
		stack3.push(3);
		stack3.push(4);
		stack3.push(9);
		stack3.push(2);
		stack3.removeBottomHalf(stack3);
		System.out.println("The top half of the stack is: " + "\n" + stack3);
		
	}
}

/*
Output:
	The size of the stack1 is: 6
	2 9 4 3 7 1 
	The size of the stack2 is: 6
	2 9 4 3 7 1 
	
	Case 1:
		Exception in thread "main" Week7.EmptyCollectionException: The stack is empty.
	Case 2:
		There is only one element in the stack.
		The top half of the stack is: 
		1 
	Case 3:
		Removed the botton half successfully.
		The top half of the stack is: 
		2 9 4 
*/
