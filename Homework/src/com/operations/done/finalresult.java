package com.operations.done;

import com.operations.add.Add1;
import com.operations.arcir.areacircle;
import com.operations.ave.Ave1;
import com.operations.div.Div1;
import com.operations.mod.Mod1;
import com.operations.multi.Multi1;
import com.operations.per.Per1;
import com.operations.root.Root1;
import com.operations.square.Square1;
import com.operations.sub.Sub1;



public class finalresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add1 ab = new Add1();
		System.out.println("1.addition : "+ab.add());
		
		Sub1 sb= new Sub1();
		System.out.println("2.subration : "+sb.sub());
		
		Multi1 mu=new Multi1();
		System.out.println("3.multiplication : "+mu.multi());
		
		Div1 dv=new Div1();
		System.out.println("4.division : "+dv.div());
		
		Mod1 mo=new Mod1();
		System.out.println("5.modulues : "+mo.mod());
		
		Ave1 av=new Ave1();
		System.out.println("6.average : "+ av.ave());
		
		
		
		Root1 ro=new Root1();
		System.out.println("7.root : "+ro.root());
		
		Square1 sq=new Square1();
		System.out.println("8.square : "+sq.square());
		
		Per1 pr=new Per1();
		System.out.println("9.percentage : "+pr.per());
		
		areacircle ac=new areacircle();
		System.out.println("10.area of circle : "+ac.arcir());
		
		
		}
	}

