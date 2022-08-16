package com.simpleandcompound;

public class compound {

	public void compoundInterest(int P,double R, int n,int T ){
		R = R/100;
		double C = 1+(R/n);
		double ci = (P*Math.pow(C,(n*T)))-P;
				
		System.out.println("Compound Interest = " +ci);
	}
}
