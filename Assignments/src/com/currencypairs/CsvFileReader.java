package com.currencypairs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CsvFileReader {
//This class retrieve data by searching values of ccy1+ccy2
	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\CurrencyPairs.csv";
		String list=null;
		String [] empty=null;
		ArrayList<CurrencyPairs> a=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader(filepath));
		Scanner scan=new Scanner(System.in);
		while((list=br.readLine())!=null)
		{
		empty=list.split(",");
		CurrencyPairs c =new CurrencyPairs(empty[0],empty[1],empty[2],empty[3],empty[4],empty[5]);
		c.setSo(empty[0]+empty[1]);
		a.add(c);
		}          
		System.out.println("Enter the CurrencyPairs to retrieve data : ");
		String currency=scan.next();
		for (CurrencyPairs ok : a)
		 if(currency.equals(ok.getCcy1()+ok.getCcy2()))
		 {
			 System.out.println(ok);
		 }
		
	}
	
}
