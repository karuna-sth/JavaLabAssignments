import java.lang.Thread;

class ThreadEx extends Thread{
	private Thread t;
	private int number;
	private String threadName;
	
	ThreadEx(int num, String t){
		number = num; 
		threadName = t;
	}
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = number; i < number + 10; i++) {
				System.out.println("From " + threadName+ " => " + i);
				if (number == 1) {
					Thread.sleep(500);					
				}
				else {
					Thread.sleep(1000);
				}
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
public class ThreadInterval {

	public static void main(String[] args) {
		// TDO Auto-generated method stub
		ThreadEx firstThread = new ThreadEx(1, "Thread -1");
		firstThread.start();
		ThreadEx secondThread = new ThreadEx(11, "Thread -2");
		secondThread.start();
	}

}
