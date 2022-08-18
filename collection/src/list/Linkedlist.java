
package list;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(25);
		ll.add(2);
		ll.add(98);
		ll.add(25);
		ll.add(45);
		ll.add(1);
		ll.addFirst(4);
		ll.addLast(100);
		System.out.println(ll);
		System.out.println(ll.offerFirst(1));
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		ll.push(11);
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
	}

}