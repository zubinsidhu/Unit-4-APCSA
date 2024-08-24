import java.util.Scanner;
public class RevisingLotteryProgramUsingStrings {

	public static void main(String[] args) {
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(2 digit): ");
		String guess = input.nextLine();
		input.close();
		
		System.out.println("The lottery number: " + lottery);
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);
		if (lottery.equals(guess)) {
			System.out.println("Exact match: You win $10,000");
		}
		else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
			System.out.println("Matched all the digits: You win $5,000");
		}
		else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2) {
			System.out.println("Matched one digit: You win $1,000");
		}
		else {
			System.out.println("No digits matched, better luck next time");
		}
	}

}
