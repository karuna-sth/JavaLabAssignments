package LAB1;
public class TryCatchFinally {
	public static void main(String args[]) {
		try {
			int data = 25 / 5;
			System.out.println(data);
		} 
		catch (NullPointerException e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("Execution Completed");
	}
} 