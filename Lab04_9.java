import java.util.Scanner;
public class Lab04_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 4-bit binary number: ");
		String binary = input.nextLine();
		input.close();
		
		int decimal = 0;
		if (binary.length() != 4) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
			decimal += (binary.charAt(3) - '0');
			decimal += (binary.charAt(2) - '0') * 2;
			decimal += (binary.charAt(1) - '0') * 2 * 2;
			decimal += (binary.charAt(0) - '0') * 2 * 2 * 2;
		}
		System.out.println("Decimal value: " + decimal);
	}

}
