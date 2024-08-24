public class Lab04_6 {

	public static void main(String[] args) {
		char ch1 = (char)('A' + (int)(Math.random() * 26));
		char ch2 = (char)('A' + (int)(Math.random() * 26));
		char ch3 = (char)('A' + (int)(Math.random() * 26));
		
		char temp;
		if (ch1 > ch2) {
			temp = ch1;
			ch1 = ch2;
			ch2 = temp;
		}
		if (ch2 > ch3) {
			temp = ch2;
			ch2 = ch3;
			ch3 = temp;
		}
		if (ch1 > ch2) {
			temp = ch1;
			ch1 = ch2;
			ch2 = temp;
		}
		System.out.println("Three random uppercase letters in alphabetical order: " + ch1 + " " + ch2 + " " + ch3);
	}

}
