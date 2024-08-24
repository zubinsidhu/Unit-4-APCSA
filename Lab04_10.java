import java.util.Scanner;
public class Lab04_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter decimal number between 0-15: ");
		int decimal = input.nextInt();
		input.close();
		
		String binary = "";
		if (decimal < 0 || decimal > 15) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
			binary = decimal % 2 + binary;
			decimal /= 2;
			binary = decimal % 2 + binary;
			decimal /= 2;
			binary = decimal % 2 + binary;
			decimal /= 2;
			binary = decimal % 2 + binary;
		}
		System.out.println("Binary number: " + binary);
	}

}
