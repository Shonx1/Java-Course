public class E01_BasicThread extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		E01_BasicThread t1 = new E01_BasicThread();
		t1.start();
		
	}
}