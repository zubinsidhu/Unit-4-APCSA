import java.util.Scanner;
public class Lab04_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ASCII code from 0 to 127: ");
		int ascii = input.nextInt();
		input.close();
		System.out.println("Character for ASCII code " + ascii + " is " + (char)(ascii));
	}
}