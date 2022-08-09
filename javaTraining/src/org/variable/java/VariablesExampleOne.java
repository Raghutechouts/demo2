package org.variable.java;

public class VariablesExampleOne {
	static int a=10;
	public VariablesExampleOne(int a) {
		System.out.println(a);
		
	}
	public void somePrint() {
		int a= 5;
		System.out.println(a);
		a++;
		
	}

	public static void main(String[] args) {
		int  a=20;
		VariablesExampleOne obj=new VariablesExampleOne(6);
		obj.somePrint();
		System.out.println(a);
		
		
	}

}
