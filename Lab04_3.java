import java.util.Scanner;
public class Lab04_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character = input.nextLine().charAt(0);
		input.close();
		System.out.println("Unicode for " + character + " is " + (int)(character));
	}
}