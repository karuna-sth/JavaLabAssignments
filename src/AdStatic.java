import java.util.Scanner;

class Addition{
	static int a, b;
	public Addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	}
	public static void sum() {
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
}
public class AdStatic {
	public static void main(String[] args) {
		new Addition();
		Addition.sum();
	}
}
