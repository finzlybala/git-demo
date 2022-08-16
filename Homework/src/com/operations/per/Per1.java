package com.operations.per;

import com.operations.variable.daywrk;

public class Per1 {
	public int per()
	{
		daywrk d=new daywrk();
		d.setA(5);
		d.setB(3);
	
		return (d.getA()/d.getB())*100;
	}

}
