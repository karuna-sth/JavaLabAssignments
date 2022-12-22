
public class OneDimAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avg = 0;
		int[] a = new int[]{1, 2, 3, 5, 10, 15};
		avg = average(a);
		System.out.println("The average of array is " + avg);
	}
	
	public static int average(int[] a) {
		int sum = 0;
		for (int i:a){
			sum += i;
			i++;
		}
		return sum/(a.length);
	}

}
