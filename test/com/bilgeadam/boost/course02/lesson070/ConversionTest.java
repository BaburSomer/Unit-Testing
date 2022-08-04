package com.bilgeadam.boost.course02.lesson070;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionTest {

	@Test
	void checkIfConversionToFahrenheidIsCorrect() {
		Conversion underTest = new Conversion();
		double temp = 80.0d;
		double actual = underTest.convertBetweenCelciusAndFahrenheid(temp, "f");
		assertEquals(176.0, actual);
	}
	
	@Test
	void checkIf0ConversionToFahrenheidIsCorrect() {
		Conversion underTest = new Conversion();
		double temp = 0.0d;
		double actual = underTest.convertBetweenCelciusAndFahrenheid(temp, "f");
		assertEquals(32.0, actual);
	}
	
	@Test
	void checkIfConversionToCelciusIsCorrect() {
		Conversion underTest = new Conversion();
		double temp = 80.0d;
		double actual = underTest.convertBetweenCelciusAndFahrenheid(temp, "c");
		assertEquals(26.6667, actual);
	}
	
	@Test
	void checkIf0ConversionToCelciusIsCorrect() {
		Conversion underTest = new Conversion();
		double temp = 0.0d;
		double actual = underTest.convertBetweenCelciusAndFahrenheid(temp, "c");
		assertEquals(-17.7778, actual);
	}
}
