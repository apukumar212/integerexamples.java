package com.pack1;

public class ClassG 
{
	int meth1()
	{
		System.out.println("meth1()called");
	return 100;
	}
	int meth2(int a,int b,String s)
	{
	System.out.println(s);	
	return a*b;
	}
	public static void main(String[] args)
	{
		ClassG aobj=new ClassG();
		System.out.println(aobj.meth1() + aobj.meth2(5,2, "JAVA IA AWESOME")+90);
	}
}
