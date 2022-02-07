package com.akshay.j2se.isa;

public class SubClass extends  MainClass{

	/*
	 * @Override public String wish() { return "HI"; }
	 */

	public static void main(String[] args) {
		MainClass m=new SubClass();
		System.out.println("result "+m.wish());
		SubClass m1=new SubClass();
		System.out.println("result "+m1.wish());
	}

}
