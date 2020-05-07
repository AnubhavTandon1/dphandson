package com.SOLID_Principles;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to our site.Would you like to order or repair?");
	String proccesOption = sc.nextLine().toLowerCase();
	String productDetail="";
	PhoneOrderRepair po= new PhoneOrderRepair();
		switch(proccesOption)
		{
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail=sc.nextLine();
			po.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it phone or accessory that you want to be repaired?");
			String productType=sc.nextLine().toLowerCase();
			if(productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail=sc.nextLine();
				po.ProcessPhoneRepair(productDetail);
				//break;
			}
			else {
				System.out.println("Please provide the accessory  name");
				productDetail=sc.nextLine();
				po.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
		 
	}
}
