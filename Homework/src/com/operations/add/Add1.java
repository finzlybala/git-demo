package com.operations.add;

import com.operations.variable.daywrk;

public class Add1 {
	public int add()
	 {
		daywrk d = new daywrk(); // d-daamaru
		d.setA(5);
		d.setB(3);
		return d.getA()+d.getB();
	}

}
