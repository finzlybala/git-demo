
package sample;

import sample.Student;

public class Student 
{
 public int add(int a,int b)
 {
	int c=a+b;
	System.out.println("1)ADDITION  "+c);
	return c;
}

 public void sub(int a,int b) 
{
	int c=a-b;
	System.out.println("2)SUBRACTION  "+c);
}
public void multi(int a,int b)
{
	int c=a*b;
     System.out.println("3)MULTIPLICATION  "+c);
}

public void div(int a, int b)
{
	double c=a/b;
     System.out.println("4)DIVISION  "+c);
}

public void mod(int a,int b) 
{
	int c=a%b;
	System.out.println("5)MODULES  "+c);
}
public void ave(int a,int b) 
{
	Student A=new Student();
     int g = A.add(a,b);
     double c=g/2;
     System.out.println("6)AVERAGE  "+c);
     }
public void root(int a) 
{
	double c=Math.sqrt(a);
	System.out.println("7)ROOT  "+c);
	}
public int square(int a) 
{
	int c=a*a;
	System.out.println("8)SQUARE  "+c);
	return c;
}
public void per(int a, int b)
{
	int c=(a/b)*100;
	System.out.println("9)PERCENTAGE  "+c);
}
public double arcir(double a)
{	
	//double c=Math.PI*(Math.sqrt(a));
	Student B=new Student();
	int h=B.square((int) a);
	double c=Math.PI*h;
	System.out.println("10)AREA OF CIRCLE  "+c);
	return c;
}
public static void main(String[]args)
{
	Student Z=new Student();
	Z.add(5, 3);
	Z.sub(5,3);
	Z.multi(5,3);
	Z.div(5, 3);
	Z.mod(5, 3);
	Z.ave(5,3);
	Z.root(5);
	Z.square(5);
	Z.per(5,3);
	Z.arcir(5);
	}
}

 
