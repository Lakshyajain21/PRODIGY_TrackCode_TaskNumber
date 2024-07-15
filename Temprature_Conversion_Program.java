import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Temprature Conversion Program");
		System.out.println("Enter the temprature value: ");
		double temprature = scanner.nextDouble();
		
		System.out.print("Enter the unit of measurement (celsius, Fahrenheit, or Kelvin): ");
		scanner.nextLine();
		String originalUnit =scanner.nextLine().toLowerCase();
		
		double convertedTempratureCelsius = 0;
		double convertedTempratureFarhenheit = 0; 
		double convertedTempratureKelvin = 0;
		
		if(originalUnit.equals("celsius")) {
			convertedTempratureCelsius = temprature;
			convertedTempratureFarhenheit = (temprature * 9/5) + 32;
			convertedTempratureKelvin =temprature + 273.15;
		}else if(originalUnit.equals("fahrenheit")) {
			convertedTempratureCelsius = (temprature -32) * 5/9;
			convertedTempratureFarhenheit = temprature;
			convertedTempratureKelvin = (temprature - 32) * 5/9 + 273.15;
		}else if(originalUnit.equals("Kelvin")) {
			convertedTempratureCelsius = temprature - 273.15;
			convertedTempratureFarhenheit = (temprature - 273.15) * 9/5 + 32;
			convertedTempratureKelvin = temprature;
		}else {
			System.out.println("Invalid Unit of measurement. Please enter Celsius, Farhenheit or kelvin");
			System.exit(1);
			
		}
		
		System.out.println("Converted Temprature: ");
		System.out.println("Celsius: " + convertedTempratureCelsius + " °C" );
		System.out.println("Fahrenheit: " + convertedTempratureFarhenheit + "°F");
		System.out.println("Kelvin: " + convertedTempratureKelvin + " K");
		
		scanner.close();

	}

}
