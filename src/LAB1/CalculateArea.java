package LAB1;
import java.util.Scanner;

public class CalculateArea {
	Double radius, length, breadth, lengthSquare;
	Double PI = 22.0/7.0;
	void calculate() {
		System.out.println("The area of circle is " + PI * radius * radius);
		System.out.println("The area of sphere is " + 4 * PI * radius * radius);
		System.out.println("The area of rectangle is " + 2 * (length * breadth));
		System.out.println("The area of square is " + length * length);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculateArea ca = new CalculateArea();
		System.out.println("Enter radius for circle and sphere: ");
		ca.radius = sc.nextDouble();
		System.out.println("Enter Length and breadth for rectangular: ");
		ca.length = sc.nextDouble();
		ca.breadth = sc.nextDouble();
		System.out.println("Enter the length of square: ");
		ca.lengthSquare = sc.nextDouble();
		ca.calculate();
		sc.close();
	}

}
