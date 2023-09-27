package multi_thread;


class Thread1 extends Thread{
	public void run() {
		System.out.println("This is task 1");
	}
}

class Thread2 implements Runnable{
	public void run() {
		System.out.println("This is task 2");
	}
}

class Thread3 implements Runnable{
	public void run() {
		System.out.println("This is task 3");
	}
}


public class MyThread {
	
	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
		th1.start();
		
		Thread1 th = new Thread1();
		th.start();
		
		Thread2 th2 = new Thread2();
		th2.run();
		
		Thread3 th3 = new Thread3();
		th3.run();
		
		
		
	}

}
