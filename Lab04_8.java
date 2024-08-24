import java.util.Scanner;
public class Lab04_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount, i.e. 11.56: ");
		String amountString = input.nextLine();
		input.close();
		
		int idxOfDecPoint = amountString.indexOf('.');
		int dollars = 0, cents = 0, quarters = 0, dimes = 0, nickels = 0;
		if (idxOfDecPoint < 0) {
			dollars = Integer.parseInt(amountString);
		}
		else {
			dollars = Integer.parseInt(amountString.substring(0, idxOfDecPoint));
			String fraction = amountString.substring(idxOfDecPoint + 1);
			if (fraction.length() >= 2) {
				fraction = fraction.substring(0, 2);
			}
			else if (fraction.length() == 1) {
				fraction = fraction + "0";
			}
			else {
				fraction = fraction + "00";
			}
			cents = Integer.parseInt(fraction);
			quarters = cents / 25;
			cents %= 25;
			dimes = cents / 10;
			cents %= 10;
			nickels = cents / 5;
			cents %= 5;
		}
		System.out.println(dollars + " dollars\n" 
				+ quarters + " quarters\n" 
				+ dimes + " dimes\n" 
				+ nickels + " nickels\n" 
				+ cents + " pennies");
	}
}