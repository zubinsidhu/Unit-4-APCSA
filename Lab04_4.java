import java.util.Scanner;
public class Lab04_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0-15: ");
		int dec = input.nextInt();
		input.close();
		
		System.out.print("Hex value for " + dec + " is: ");
		if (dec < 0 || dec > 15) {
			System.out.println("not valid");
			System.exit(dec);
		}
		else if (dec < 10) {
			System.out.println(dec);
		}
		else {
			System.out.println((char)('A' + dec - 10));
		}	
	}
}