package org.collectionInJava;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueGeneric1 {
	public static void main(String[]args) {
		Queue<Integer> queue=new PriorityQueue<Integer>();
		//while adding element in queue,it always keep smallest element on top
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(1);
		System.out.println("Size="+queue.size());
		System.out.println("Element Of queue="+queue);
		/*element() return top most element of the queue,if the queue is empty then it will
		 * throw an ecxeption by name"NoSuchElementException" */
		System.out.println("head element of the queue using element()="+queue.element());
		/*peek() return top most element of the queue,if the queue is empty then it will
		 * return "null" instead of throwing exception*/
		System.out.println("head element of the queue using peek()="+queue.peek());
		System.out.println("Iterating the queue using for-each loop:");
		for(Object obj:queue) {
			System.out.println(obj);
		}
		System.out.println("Iterating the queue using iterator ");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		/*remove() method remove top most element of the queue,if the queue is empty then
		 * it will throw an ecxeption by name"NoSuchElementException" */
		System.out.println("Removing element from queue using remove()="+queue.remove());
		System.out.println("Elements of queue="+queue);
		/*poll() method remove  top most element of the queue,if the queue is empty then it will
		 * return "null" instead of throwing exception*/
		System.out.println("Removing element from queue using poll()="+queue.poll());
		System.out.println("Elements of queue="+queue);
		System.out.println("After removing two elements:");
		Iterator itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("**Print queue Using Lambda expression**");
		//Using lambda Expression
		queue.forEach(obj->{
			System.out.println(obj);
		});
	}
}
