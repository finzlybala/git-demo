package set;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(15);
		hs.add(52);
		hs.add(48);
		hs.add(1);
		hs.add(15);
		hs.add(11);
		hs.add(25);
		hs.add(2);
		hs.add(11);
		hs.add(30);
		hs.add(1);
		System.out.println(hs);
		System.out.println(hs.size());
	}

}