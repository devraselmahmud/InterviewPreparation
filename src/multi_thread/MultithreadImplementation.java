package multi_thread;

class MThread implements Runnable {

	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class MultithreadImplementation {

	public static void main(String[] args) {

		int n = 8;

		for (int i = 0; i < n; i++) {

			// creating thread reference object

			Thread th = new Thread(new MThread());

			th.start();
		}
	}
}
