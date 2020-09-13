package com.cookingcalculator.javafx;

public class Conversions {
	
	public static double getConversionFactor (int u1, int u2){
		int unit1 = u1; //need set unit1
		int unit2 = u2; //need set unit2
		double conversionFactor = 0; //need get conversionFactor
		
		if (unit1 == 1){
			//Tsp
			if (unit2 == 1){
				//Tsp
				conversionFactor = 1.0;
			}else if (unit2 == 2){
				//Tbsp	
				conversionFactor = 0.33;
			}else if (unit2 == 3){
				//Cups
				conversionFactor = 0.02;
			}else if (unit2 == 4){
				//Pints
				conversionFactor = 0.01;
			}else if (unit2 == 5){
				//Quarts
				conversionFactor = 0.01;
			}else if (unit2 == 6){
				//Milliliters
				conversionFactor = 4.93;
			}
		}else if (unit1 == 2){
			//Tbsp	
			if (unit2 == 1){
				//Tsp
				conversionFactor = 3.00;
			}else if (unit2 == 2){
				//Tbsp	
				conversionFactor = 1.0;
			}else if (unit2 == 3){
				//Cups
				conversionFactor = 0.06;
			}else if (unit2 == 4){
				//Pints
				conversionFactor = 0.03;
			}else if (unit2 == 5){
				//Quarts
				conversionFactor = 0.02;
			}else if (unit2 == 6){
				//Milliliters
				conversionFactor = 14.79;
			}
		}else if (unit1 == 3){
			//Cups
			if (unit2 == 1){
				//Tsp
				conversionFactor = 48.0;
			}else if (unit2 == 2){
				//Tbsp	
				conversionFactor = 16.0;
			}else if (unit2 == 3){
				//Cups
				conversionFactor = 1.0;
			}else if (unit2 == 4){
				//Pints
				conversionFactor = 0.5;
			}else if (unit2 == 5){
				//Quarts
				conversionFactor = 0.25;
			}else if (unit2 == 6){
				//Milliliters	
				conversionFactor = 236.59;
			}
		}else if (unit1 == 4){
			//Pints
			if (unit2 == 1){
				//Tsp
				conversionFactor = 96.0;
			}else if (unit2 == 2){
				//Tbsp	
				conversionFactor = 32.0;
			}else if (unit2 == 3){
				//Cups
				conversionFactor = 2.0;
			}else if (unit2 == 4){
				//Pints
				conversionFactor = 1.0;
			}else if (unit2 == 5){
				//Quarts
				conversionFactor = 0.5;
			}else if (unit2 == 6){
				//Milliliters	
				conversionFactor = 473.18;
			}
		}else if (unit1 == 5){
			//Quarts
			if (unit2 == 1){
				//Tsp
				conversionFactor = 192.0;
			}else if (unit2 == 2){
				//Tbsp	
				conversionFactor = 64.0;
			}else if (unit2 == 3){
				//Cups
				conversionFactor = 4.0;
			}else if (unit2 == 4){
				//Pints
				conversionFactor = 2.0;
			}else if (unit2 == 5){
				//Quarts
				conversionFactor = 1.0;
			}else if (unit2 == 6){
				//Milliliters
				conversionFactor = 946.35;
			}
		}else if (unit1 == 6){
			//Milliliters	
			if (unit2 == 1){
				//Tsp
				conversionFactor = 0.02;
			}else if (unit2 == 2){
				//Tbsp	
				conversionFactor = 0.07;
			}else if (unit2 == 3){
				//Cups
				conversionFactor = 0.0;
			}else if (unit2 == 4){
				//Pints
				conversionFactor = 0.0;
			}else if (unit2 == 5){
				//Quarts
				conversionFactor = 0.0;
			}else if (unit2 == 6){
				//Milliliters	
				conversionFactor = 1.0;
			}
		}
		
		return conversionFactor;
	}
	

}
