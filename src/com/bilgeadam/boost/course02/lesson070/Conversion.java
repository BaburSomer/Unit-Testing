package com.bilgeadam.boost.course02.lesson070;

public class Conversion {
	
	public static void main(String[] args) {
		Conversion convert = new Conversion();
		System.out.printf("45 Celcius %2.2f Fahrenheid'a tekabül eder", convert.convertBetweenCelciusAndFahrenheid(45, "f"));
		System.out.println();
		System.out.printf("45 Fahrenheid %2.2f Celcius'a tekabül eder", convert.convertBetweenCelciusAndFahrenheid(45, "c"));
	}
	
	/**
	 * 
	 * @param temp	A temperature value given in Fahrenheid or in Celius
	 * @param targetUnit	Target temperature unit to be converted
	 * @return	4 decimal places accurate converted value
	 */
	public double convertBetweenCelciusAndFahrenheid(double temp, String targetUnit) {
		if (targetUnit.equalsIgnoreCase("c")) { //
			double celcius = (temp -32) * (5.0 / 9.0);
		
			return (double)Math.round(celcius * 10000d) / 10000d;
		}
		
		return temp * (9.0 / 5.0) + 32;
	}
}
