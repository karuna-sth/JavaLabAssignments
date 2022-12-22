package LAB1;
import java.util.Scanner;

public class AddStatic {
	static int a , b;
	static void staticDisplay(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("sum = "+ (a+b));
		sc.close();
	}
	public static void main(String[] args)
	{
		staticDisplay();
	}
}
