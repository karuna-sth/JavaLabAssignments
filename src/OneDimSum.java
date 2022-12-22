class OneDim{
	public void sum() {
		int sum = 0;
		int[] a = new int[]{1, 2, 3, 5, 10, 15};
		for (int i:a){
			sum += i;
			i++;
		}
		System.out.println("The sum of array is " + sum);
		
	}
}
public class OneDimSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneDim od = new OneDim();
		od.sum();
		
		//OneDim.sum();
	}

}
