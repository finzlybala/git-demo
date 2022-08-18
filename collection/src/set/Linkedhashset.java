package set;

import java.util.LinkedHashSet;
public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lh =new LinkedHashSet<>();
		lh.add(15);
		lh.add(89);
		lh.add(15);
		lh.add(35);
		System.out.println(lh);
	}

}