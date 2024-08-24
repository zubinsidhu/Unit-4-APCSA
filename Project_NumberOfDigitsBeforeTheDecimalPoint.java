import java.util.Scanner;
public class Project_NumberOfDigitsBeforeTheDecimalPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a floating point number: ");
		double number = input.nextDouble();
		String name = "" + number;
		int digits = name.indexOf('.');
		System.out.print("The number of digits before the decimal point in " + number + " is " + digits);
		input.close();
	}
}