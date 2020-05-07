package com.SOLID_Principles.DependencyInversalPrinciple.DependencyInjection;

import com.SOLID_Principles.IPhone;

public class ProcessPhoneRepair {
	public void RepairSteps(IPhone phone) {
		String part1 = phone.getPhonePart1();
		System.out.println(part1+" Repaired!");
		
		Double partCost=phone.getPart1Cost();
		System.out.println("Repair cost "+partCost*0.5);
	}

}
