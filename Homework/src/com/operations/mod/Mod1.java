package com.operations.mod;

import com.operations.variable.daywrk;

public class Mod1 {
	public int mod() 
	{
		daywrk d=new daywrk();
		d.setA(5);
		d.setB(3);
	
		return d.getA()%d.getB();
	}

}
