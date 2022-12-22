
public class MatrixOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1, 2}, {8, 9}};
		int[][] arr2 = {{1, 2}, {8, 9}};
		sum(arr1, arr2);
		sub(arr1, arr2);
		mul(arr1, arr2);
	}
	
	public static void sum(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[2][2];
		System.out.println("The sum of array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println(sum[i][j]);
			}
		}
	}
	
	public static void sub(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[2][2];
		System.out.println("The subtraction of array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j] = arr1[i][j] - arr2[i][j];
				System.out.println(sum[i][j]);
			}
		}
	}
	
	public static void mul(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[2][2];
		int temp = 0;
		System.out.println("The multiplication of array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k<2; k++) {
					temp +=  arr1[i][k] * arr2[k][j];
				}
				sum[i][j] = temp;
				System.out.println(sum[i][j]);
			}
		}
	}

}
