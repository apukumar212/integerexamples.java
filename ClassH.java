package com.pack1;

public class ClassH 
{
void meth1()
{
	System.out.println(10);
	System.out.println(20);
	System.out.println(30);
}
int meth2()
{
	System.out.println("meth2() called");
	return 'B'; //[int and char datatypes both are compatable
	//System.out.println("hello world"); //compile error bcz it is unreachable code
}
int meth3()
{
	System.out.println("meth3() called");
	int i=10;
	if(i<=25)
	{
	System.out.println("if block executed");
	
	//System.out.println("hello");//compile error(unreachable code)
	}
	return 100;
}
public static void main(String[] args)
{
	System.out.println("START");  
	ClassH obj=new ClassH();
	obj.meth1();
	System.out.println("----------------");
	int i=obj.meth2();
	System.out.println("meth2() is returning:"+i);
	System.out.println("----------------");
	int result=obj.meth3();
	System.out.println("Result value:"+result);
	System.out.println("End");
}
}


















