import java.util.Scanner;

public class CheckPrime {
	int check(int num) {
		int i, check = 0;
		if (num % 2 == 0){
			return 0;
		}
		else {
			for (i=3; i < num; i+=2) {
				if (num % i == 0) {
					check = 0;
				}
				else {
					return 1;
				}
			}
		}
		return check;
	}
	public static void main(String[] args) {
		int prime;
		Scanner sc = new Scanner(System.in);
		CheckPrime cp = new CheckPrime();
		System.out.println("Enter number to check prime: ");
		int number = sc.nextInt();
		prime = cp.check(number);
		if (prime == 0) {
			System.out.println(number + " is not a prime number");
		}
		else {
			System.out.println(number + " is a prime number");
		}
		sc.close();
	}

}
