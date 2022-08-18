package list;

import java.util.Collections;
import java.util.Vector;

public class Vectorlist {
	
	public static void main(String[] args) {
		Vector<String> vr = new Vector<>();
		vr.add("bala");
		vr.add("krishnan");
		vr.add("cbk");
		vr.add("bala");
		vr.add("finzly");
		Collections.sort(vr);
		System.out.println(vr);
		System.out.println(vr.get(3));
		vr.setSize(10);
		System.out.println(vr.size());
		System.out.println(vr.capacity());
		System.out.println(vr);
		vr.insertElementAt("first", 1);
		System.out.println(vr);
		System.out.println(vr.indexOf("bala"));
		for(String values : vr) {
			System.out.println(values);
		}
		vr.clear();
		System.out.println(vr);
		System.out.println(vr.isEmpty());
	}
	
	
	
	
}