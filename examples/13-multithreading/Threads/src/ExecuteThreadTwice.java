public class ExecuteThreadTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		ExecuteThreadTwice t1 = new ExecuteThreadTwice();
		t1.start();
		t1.start();
	}
}