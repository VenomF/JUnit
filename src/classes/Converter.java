package classes;

public class Converter {
	
	public static double kgToLbs(double kg) {
		return kg*2.204;
	}
	
	public static double lbsToKg(double lbs) {
		return lbs*2.204;
	}
	
	public static double cmToInch(double cm) {
		return cm/2.54;
	}
	
	public static double inchToCm(double inch) {
		return inch*2.54;
	}
	
	public static double celsiusToFahrenheit(double c) {
		return c*1.8+32;
	}
	
	public static double fahrenheitToCelsius(double f) {
		return (f-32)*0.5556;
	}

}
