package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static classes.Converter.*;

public class ConverterTest {

	double testedValue;

	@Test
	public void kgToLbs_passWeightInKilograms_returnWeightInLbs() {
		testedValue=kgToLbs(25);
		assertEquals(55.115, testedValue, 1);
	}

	@Test
	public void lbsToKg_passMassInPounds_returnMassInKilograms() {
		testedValue=lbsToKg(50);
		assertEquals(110.231131, testedValue, 1);
	}

	@Test
	public void cmToInch_passLenghtInCentimeters_returnLenghtInInches() {
		testedValue=cmToInch(10);
		assertEquals(3.937008, testedValue, 1);
	}

	@Test
	public void inchToCm_passLenghtInInshes_returnLenghtInCentimeters() {
		testedValue=inchToCm(3.937008);
		assertEquals(10, testedValue, 1);
	}

	@Test
	public void celsiusToFahrenheit_passTemperatureInCelsius_returnTemperatureInFahrenheit() {
		testedValue=celsiusToFahrenheit(37);
		assertEquals(98.6, testedValue, 1);
	}

	@Test
	public void fahrenheitToCelsius_passTemperatureInCelsius_returnInFahrenheit() {
		testedValue=fahrenheitToCelsius(98.6);
		assertEquals(37, testedValue, 1);
	}

}
