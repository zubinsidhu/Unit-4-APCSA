import java.util.Scanner;
public class Lab04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine().toUpperCase();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine().toUpperCase();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine().toUpperCase();
		input.close();
		
		String temp;
		if (city1.compareTo(city2) > 0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
		}
		if (city2.compareTo(city3) > 0){
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		if (city1.compareTo(city2) > 0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
		}
		System.out.println(city1+ " " + city2+ " " + city3);
	}
}