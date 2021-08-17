package Week7;

public class LinkedStack {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}
	
	// This method removes the half of elements sitting at the bottom of the stack.
	// Q1: what should be the return type of this method? Void
	// Q2: what to return if there is only 1 element in the input stack? Print an alert message?
	// TC = O(N), while N is the number of nodes in the input stack. 
	void removeBottomHalf(LinkedStack stack1) {
		if (isEmpty()) {
            throw new EmptyCollectionException("stack");
		}
		if (size() == 1) {
			System.out.println("\n" + "There is only one element in the stack.");
			return;
		}
		LinkedStack stack2 = new LinkedStack();
		// Find the middle element's index
		int middle = count / 2;
		// Shuffle the half of the elements sitting at the top of the stack into stack2.
		// The order is reversed in stack2.
		for (int i = 0; i < middle; i++) {
			stack2.push(stack1.pop());
		}
		// Empty the stack1.
		while (!stack1.isEmpty()) {
			stack1.pop();
		}
		// Shuffle the half of the elements sitting at the top of the stack into stack1.
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		System.out.println("\n" + "Removed the botton half successfully.");

	}
}
