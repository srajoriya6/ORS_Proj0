package com.raystech.proj0.ctl;

public class B extends A{

	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int add1(int a, int b)
	{
		System.out.println("1");
		return 0;
	}
	
	public int add1(int a, int ...b)
	{
		System.out.println("2");
		return  00;
	}
	public static void main(String[] args) {
		B b =new B();
		b.add1(6, new int[5]);
	}

	
}
