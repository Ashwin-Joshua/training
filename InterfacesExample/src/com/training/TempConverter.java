package com.training;

import com.training.ifaces.Function;

public class TempConverter implements Function {
		
	//celcius to farenheit
	@Override
	public double apply(double arg) {
		// TODO Auto-generated method stub
		return (arg* 9/5)+32;
	}

}
