import java.util.Scanner;

public class CheckBalance {
	int checker(int[] arr) {
		int balancedValue = 0;
		for (int i : arr) {
			if ( i % 2 == 0) {
				if (arr[i] % 2 == 0) {
					balancedValue = 1;
				}
				else {
					return 0;
				}
			}
			else {
				if (arr[i] % 2 != 0) {
					balancedValue = 1;
				}
				else {
					return 0;
				}
			}
		}
		return balancedValue;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckBalance cb = new CheckBalance();
		System.out.println("Enter length of an array: ");
		int len = sc.nextInt();
		System.out.println("Enter value for array: ");
		int arr[] = new int[len];
		for (int i = 0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		int result = cb.checker(arr);
		if (result == 1) {
			System.out.println("The array is balanced");
		}
		else {
			System.out.println("The array is not balanced");
		}
		sc.close();
	}

}
