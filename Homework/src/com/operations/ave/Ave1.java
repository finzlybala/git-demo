package com.operations.ave;

//import com.operations.add.Add1;
//import com.operations.div.Div1;
import com.operations.variable.daywrk;

public class Ave1 {
	public double ave() 
	{
		daywrk d = new daywrk();
		d.setA(5);
		d.setB(3);
		/*Add1 A=new Add1();
	     int g = A.add();
	     Div1 D=new Div1();
	     double c=D.div(g, 2);*/
		
	    //double c=d.getA()+d.getB()/2;
	    
	     return (d.getA()+d.getB())/2;
	     }

}
