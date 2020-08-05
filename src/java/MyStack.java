package algorithmsAndDS;

/**
 * Basic Implementation of Stack Data Structure
 * @author Himanshu
 *
 */
public class MyStack {
	
	
	Node top;
	
	/**
	 *  inner class that holds the data as added to the stack
	 * @author Himanshu
	 *
	 */
	private class Node{
		Node next =null;
		Object data;
		Node(Object o)
		{
			data = o;
		}
	}
	
	/**
	 * Add the object to the Stack
	 * @param o
	 */
	public void push(Object o)
	{
		Node n = new Node(o);
		n.next = top;
		top = n;
	}
	
	/**
	 * Removes object from the Stack
	 * @return
	 */
	public Object pop()
	{
		if(top != null)
		{
			Object item = top.data;
			top = top.next;
			return item;
			
		}
		return null;
	}
	
	/**
	 * Returns the top object from the Stack
	 * @return
	 */
	public Object peek()
	{	if(top == null)
			return null;
	
	   return top.data;
	}

}
