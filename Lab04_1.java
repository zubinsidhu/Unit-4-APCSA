import java.util.Scanner;
public class Lab04_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides of Regular Polygon: ");
		int n = input.nextInt();
		System.out.print("Enter the length of a side: ");
		double s = input.nextDouble();
		input.close();
		double area = n * s * s / (4 * Math.tan(Math.PI / n));
		System.out.println("The area of " + n + "-side regular polygon: " + Math.round(area));
	}
}