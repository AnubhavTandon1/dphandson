package com.SOLID_Principles;

public class PhoneOrderRepair implements IOrderRepair {
	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType+" Accessory Repair Accepted!");
	}
	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName+" Repair Accepted!");
	}
	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName+" Order Accepted!");
	}
}
