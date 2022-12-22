package LAB1;

public class MatrixOp {

	public static void main(String[] args) {
		int[][] arr1 = {{5, 2}, {6, 2}};
		int[][] arr2 = {{1, 2}, {3, 3}};
		int[][] result = new int[2][2];
		result = sum(arr1, arr2);
		display(result);
		result = sub(arr1, arr2);
		display(result);
		result = mul(arr1, arr2);
		display(result);
	}
	
	public static int[][] sum(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[2][2];
		System.out.println("The sum of array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}
	
	public static int[][] sub(int[][] arr1, int[][] arr2) {
		int[][] sub = new int[2][2];
		System.out.println("The subtraction of array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sub[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		return sub;
	}
	public static int[][] mul(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[2][2];
		System.out.println("The multiplication of array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k<2; k++) {
					sum[i][j] +=  arr1[i][k] * arr2[k][j];
				}
			}
		}
		return sum;
	}
	public static void display(int[][] res) {
		for (int i = 0; i < res.length; i++) { 
	         for (int j = 0; j < res[i].length; j++) {
	            System.out.print(res[i][j] + " ");
	         }
	         System.out.println();
	      }
	}
}
