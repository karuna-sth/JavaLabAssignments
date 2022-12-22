package LAB1;

public class OneDimAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		int[] a = new int[]{1, 2, 3, 5, 10, 15};
		s = sum(a);
		System.out.println("The average of array is " + s);
	}
	
	public static int sum(int[] a) {
		int sum = 0;
		for (int i:a){
			sum += i;
		}
		return sum;
	}

}