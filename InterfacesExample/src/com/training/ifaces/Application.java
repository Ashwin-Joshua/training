package com.training.ifaces;

import com.training.*;

public class Application {
	
	public static void printResult(Conditional conditional) {
		System.out.println(conditional.test());
	}
	
	public static void printValues(Function[] objects) {
		
		for(Function eachFunction:objects)
		System.out.println(eachFunction.apply(50));
	}

	public static void main(String[] args) {
		Function usdToInr =new CurrencyConverter();
		Function celToFar = new TempConverter();
		
		Function[] functions = {usdToInr,celToFar};
		printValues(functions);
		
		Student ash = new Student(100,80);
		printResult(ash);
		
		Professor abd = new Professor(202,"abd");
		printResult(abd);

	}

}
