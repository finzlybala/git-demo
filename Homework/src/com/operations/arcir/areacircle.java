package com.operations.arcir;

import com.operations.variable.daywrk;

public class areacircle {
	public double  arcir()
	{	
		//double c=Math.PI*(Math.sqrt(a));
		daywrk d = new daywrk();
		//Square1 B=new Square1();
		d.setA(5);
		
		//int h=B.square((int) a);
		//double c=Math.PI*h;
		
		
		return Math.PI*(Math.sqrt(d.getA()));
	}

}
