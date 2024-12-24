package org.collectionInJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		System.out.println("Size="+queue.size());
		System.out.println("Elements of queue="+queue);
		/*peek() return top most element of the queue,if the queue is empty then it will
		 * return "null" instead of throwing exception*/
		System.out.println("Head element of the queue using peek()="+queue.peek());
		/*element() return top most element of the queue,if the queue is empty then it will
		 * throw an ecxeption by name"NoSuchElementException" */
		System.out.println("Head element of the queue using element()="+queue.element());
	}
}
