package set;

import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(48);
		ts.add(1);
		ts.add(15);
		ts.add(11);
		ts.add(25);
		ts.add(5);
		ts.add(11);
		ts.add(30);
		System.out.println(ts);
		System.out.println(ts.higher(2));
		System.out.println(ts.ceiling(14));
		System.out.println(ts.first());
		System.out.println(ts.floor(20));
		System.out.println(ts.lower(50));
		System.out.println(ts.toString());
		System.out.println(ts);
	}

}