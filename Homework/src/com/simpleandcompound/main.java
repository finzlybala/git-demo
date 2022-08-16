package com.simpleandcompound;

public class main {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}
//public class Main {
	public static void main(String[] args) {
		cube c = new cube();
		c.Cube(2.2);
		simple si = new simple();
		si.simple(2000, 10, 1);
		compound ci = new compound();
		ci.compoundInterest(2000, 1, 1, 2);
		division d = new division();
		d.Division(70, 80, 95, 86, 90);
	}

}