package com.operations.sub;

import com.operations.variable.daywrk;

public class Sub1 {
	public int sub() 
	{
		daywrk d = new daywrk();
		d.setA(5);
		d.setA(3);
		
		return d.getA()-d.getB();
	}

}
