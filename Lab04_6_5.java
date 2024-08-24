public class Lab04_6_5 {

	public static void main(String[] args) {
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);
		char ch1 = (char)('A' + (int)(Math.random() * 26));
		char ch2 = (char)('A' + (int)(Math.random() * 26));
		char ch3 = (char)('A' + (int)(Math.random() * 26));
		char ch4 = (char)('A' + (int)(Math.random() * 26));
		
		String licensePlate = "" + digit1 + digit2 + digit3 + ch1 + ch2 + ch3 + ch4;
		System.out.println(licensePlate);
	}

}
