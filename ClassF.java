package com.pack1;

public class ClassF 
{
int meth1(int a,int b)
{
	System.out.println(a);
	return a+b;
}
public static void main(String[] args) 
{
  System.out.println(new ClassF().meth1(99,1)-99);
}
}

