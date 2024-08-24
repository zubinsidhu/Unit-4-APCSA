import java.util.Scanner;
public class HexadecimalDigitToDecimalValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Hex digit: ");
		String hexString = input.nextLine();
		input.close();
		
		if (hexString.length() != 1) {
			System.out.println("Invalid input. Enter only 1 character.");
			System.exit(1);
		}
		char hex = hexString.toUpperCase().charAt(0);
		System.out.print("The decimal value for hex digit " + hex + " is ");
		if (hex >= 'A' && hex <= 'F') {
			System.out.println(10 + hex - 'A');
		}
		else if (hex >= '0' && hex <= '9') {
			System.out.print(hex);
		}
		else {
			System.out.println("not valid");
		}
	}

}
