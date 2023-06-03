package com.calculator;

public class Calculator {
	
	   public static void add(int a, int b) {
		   System.out.println("Sum = " + (a+b));
	   }
	   public static void sub(int a, int b) {
		   System.out.println("Sub = " + Math.abs(a-b));
	   }
	   public static void div(int a, int b) {
		   System.out.println("Div = " + (a/b));
	   }
   public static void main(String[] args) {
	 add(10,20);
	 sub(5,10);
	 div(20,5);
   }
}
