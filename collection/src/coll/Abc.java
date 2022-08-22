package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Abc {
	public static void main(String[] args) {

	ArrayList<String> s= new ArrayList<>();
	s.add("asd");
	s.add("fgh");
	s.add("jkl");

	ArrayList<String> e= new ArrayList<>();
	e.add("qwe");
	e.add("rty");
	e.add("uiop");
	
	ArrayList<String> c = new ArrayList<>();
	c.add("zxc");
	c.add("vbn");
	c.add("m");
	
	HashMap<String , ArrayList<String>> key = new HashMap<>();
	key.put("First", s);
	key.put("Second", e);
	key.put("Third", c);
	
	HashMap<String,HashMap<String , ArrayList<String>>> place = new HashMap<>();
	place.put("Lap", key);
	System.out.println(place);
	System.out.println("enter the key");
	Scanner scan=new Scanner(System.in);
	String ss=scan.next();
	
	for(String fg  :key.keySet()) {
		
		if(ss.equals(fg)) {
			System.out.println( key.get(ss));
		}
		
	}
System.out.println("done");	
}
}