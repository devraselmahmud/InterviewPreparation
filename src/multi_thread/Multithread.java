package multi_thread;

// multi-threading by extending Thread class 

class MultiThreading extends Thread {

	public void run() 
	{	
		try 
		{
			System.out.println("Thread is running");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occurs: Not My Fault :(");
		}
	}
}

public class Multithread {

	public static void main(String[] args)
	{
		int n = 10;
		for(int i=0; i<n; i++)
		{
			// creating object reference
			
			MultiThreading th = new MultiThreading();
			
			// starting the thread
			
			th.run();
		}
	}
}
