import java.util.*;
public class ComputingAnglesOfATriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Prompt user to enter three points
		System.out.print("Enter x- and y- coordinates for A: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x- and y- coordinates for B: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("Enter x- and y- coordinates for C: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		
		//Compute three sides a, b, c
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		//Compute three angles A, B, C in degrees
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		//Display results
		System.out.println("The three angles are " + "\nA: " + Math.round(A) + "\nB: " + Math.round(B) + "\nC: " + Math.round(C));
	}
}