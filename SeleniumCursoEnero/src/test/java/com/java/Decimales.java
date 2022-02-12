package com.java;

public class Decimales {
	
	public static void main(String[] args) {
		
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
		n1 = n1*1000;
		n2 = n2*1000;
		
		n1 = (int) n1;
		n2 = (int) n2;
		
//		if(n1==n2) {
//			return true;
//		}else {
//			return false;
//		}
		
		return n1==n2 ? true : false;
		
	}

}
