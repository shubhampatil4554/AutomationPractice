package org.collectionInJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue3 {
	public static void main(String[]args) {
		Queue queue=new PriorityQueue();
		System.out.println("size="+queue.size());
		System.out.println("Elements in queue="+queue);
		/*poll() method remove  top most element of the queue,if the queue is empty then it will
		 * return "null" instead of throwing exception*/
		System.out.println("Removing element from queue using poll()="+queue.poll());
		/*remove() method remove top most element of the queue,if the queue is empty then
		 * it will throw an ecxeption by name"NoSuchElementException" */
		System.out.println("Removing element from queue using remove()="+queue.remove());
	}
}
