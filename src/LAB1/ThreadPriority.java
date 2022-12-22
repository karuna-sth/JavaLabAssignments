package LAB1;
class MultiThreadEx extends Thread{
	private Thread t;
	private int number;
	private String threadName;
	
	MultiThreadEx(int num, String t){
		number = num; 
		threadName = t;
	}
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = number; i < number + 7; i++) {
				System.out.println("From " + threadName+ " => " + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println(threadName + " interrupted.");
		}
		System.out.println(threadName + " compeleted and exiting.");
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TDO Auto-generated method stub
		MultiThreadEx firstThread = new MultiThreadEx(1, "Min Priority Thread -1");
		MultiThreadEx secondThread = new MultiThreadEx(8, "Max PriorityThread -2");
		MultiThreadEx thirdThread = new MultiThreadEx(15, "Normal PriorityThread -3");
		firstThread.setPriority(Thread.MIN_PRIORITY);
		secondThread.setPriority(Thread.MAX_PRIORITY);
		thirdThread.setPriority(Thread.NORM_PRIORITY);
	
		firstThread.start();
		secondThread.start();
		thirdThread.start();
		
	}

}
