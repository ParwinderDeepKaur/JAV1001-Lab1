import java.util.Scanner;

/**
* @author  Parwinder Deep Kaur
* @version 1.0
* @since   2021-09-23

* Name: Parwinder Deep Kaur
* Student ID: A00237487
* The Program takes the numeric value and unit of measurement from the user.
* Then using Switch statement it finds the correct unit_of_conversion, 
* afterward calculates and prints the result with appropriate units.
*/

public class Convert{
	
	// contant variables for calculations
	public static final double KILOMETER_MILES = 1.609344d;
	public static final double CENTIMETER_INCH = 2.54d;
	public static final double KILOGRAM_POUND = 0.45359237d;
	public static final double GRAM_OUNCE = 28.34952d;		
		
	public static void main(String args[]){
		
		Scanner inputScanner = new Scanner(System.in);
		String measurementUnit, reRun = "Y";
		double inputValue, result;
		
		System.out.println("Accepted Unit of Measurements :\nkm for Kilometer\nmi for Miles"+
			"\ncm for Centimeter\nin for Inch\nkg for Kilogram\nlb for Pound\ng for Gram\noz for Ounce");	//	prints accepted measurement unit		
			
		do {		
			System.out.print("Enter a value to convert: ");
			inputValue = inputScanner.nextDouble();	//	store value in double type variable	
		
			System.out.print("Enter the current unit of measure: ");
			measurementUnit = inputScanner.next().toString().toLowerCase();	// store unit_of_conversion in String variable
		
			// matches the unit_of_conversion & do appropriate conversions
			switch(measurementUnit){
				
				//converts kilometer into equivalent miles and print output
				case "km":	
				result = inputValue / KILOMETER_MILES;
				System.out.println(inputValue + measurementUnit + " is equal to " + String.format("%.2f",result) + "mi");
				break;
				
				//converts miles into equivalent kilometer and print output
				case "mi":	
				result = inputValue * KILOMETER_MILES;
				System.out.println(inputValue + measurementUnit + " is equal to " + result + "km");
				break;
				
				//converts centimeter into equivalent inch and print output
				case "cm":	
				result = inputValue / CENTIMETER_INCH;
				System.out.println(inputValue + measurementUnit + " is equal to " + result + "in");
				break;
		
				//converts inch into equivalent centimeter and print output
				case "in":
				result = inputValue * CENTIMETER_INCH;
				System.out.println(inputValue + measurementUnit + " is equal to " + String.format("%.2f",result) + "cm");	
				break;
				
				//converts kilogram into equivalent pound and print output
				case "kg":
				result = inputValue / KILOGRAM_POUND;
				System.out.println(inputValue + measurementUnit + " is equal to " + result + "lb");	
				break;
		
				//converts pound into equivalent kilogram and print output
				case "lb":
				result = inputValue * KILOGRAM_POUND;
				System.out.println(inputValue + measurementUnit + " is equal to " + String.format("%.2f",result) + "kg");
				break;

				//converts gram into equivalent ounce and print output	
				case "g":
				result = inputValue /  GRAM_OUNCE;
				System.out.println(inputValue + measurementUnit + " is equal to " + String.format("%.2f",result) + "oz");
				break;
		
				//converts ounce into equivalent gram and print output
				case "oz":
				result = inputValue *  GRAM_OUNCE;
				System.out.println(inputValue + measurementUnit + " is equal to " + result + "gm");
				break;		

				default:
				System.out.println("Please enter correct unit of measurements.");
			}
			System.out.println("Do you want to continue? Enter Y/N");
			reRun = inputScanner.next();	//	takes decision value from user if want to calculate further or not
		} while(reRun.toUpperCase().equals("Y"));	//	check input if Y then continue, else stop
		
		inputScanner.close(); //	close scanner
	}	
}