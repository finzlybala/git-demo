package com.currencypairs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
// This class shorts the currency based on ccy1 and ccy2
	public static void main(String[] args) throws IOException {
	
		String filepath="C:\\Users\\CurrencyPairs.csv";
		String line=null;
		String [] emp=null;
		ArrayList<CurrencyPairs> a=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader(filepath));
		Scanner scan=new Scanner(System.in);

		while((line=br.readLine())!=null)
		{
		emp=line.split(",");
		CurrencyPairs c =new CurrencyPairs(emp[0],emp[1],emp[2],emp[3],emp[4],emp[5]);
		c.setSo(emp[0]+emp[1]);
		a.add(c);
		}    
		a.sort((CurrencyPairs o1,CurrencyPairs o2)-> (o1.getSo().compareTo(o2.getSo())));
		for(CurrencyPairs dd : a)
		{
			System.out.println(dd);
		}
	}

}
