package com.anees;

@FunctionalInterface
interface NumberAddition {
	int Add2Numbers(int num1,int num2);
}



public class Add2Numbers {

	public static void main(String[] args) {
		NumberAddition obj = (num1,num2) -> num1 + num2;

		
		System.out.println(obj.Add2Numbers(12, 3));

	}

}
