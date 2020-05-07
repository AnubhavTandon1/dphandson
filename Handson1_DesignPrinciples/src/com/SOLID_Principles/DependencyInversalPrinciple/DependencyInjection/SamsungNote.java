package com.SOLID_Principles.DependencyInversalPrinciple.DependencyInjection;

import com.SOLID_Principles.IPhone;

public class SamsungNote implements IPhone{
	public String getPhonePart1() {
		return "Display";
	}
	public double getPart1Cost() {
		return 500;
	}
}
