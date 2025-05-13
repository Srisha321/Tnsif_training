package com.tns.day7;

public class MethodoverloadingDemo {
	public static void main(String[] args) {
		System.out.println("The addition of two no's is "+MethodOverloading.addition(19.2f,20));
		System.out.println("The addition of two no's is "+MethodOverloading.addition(19,20));
		System.out.println("The addition of two no's is "+MethodOverloading.addition(19,20,5));
		Point p;
		p=new Point();
		System.out.println(p);
        System.out.println(p);
		p=new Point(12.7f);
		System.out.println(p);
		p=new Point(12.3f,14.5f);
		System.out.println(p);
	}
	
}
