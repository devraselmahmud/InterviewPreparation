package exception_handling;

//using try-catch block

public class HandleException {
	
	public static void main(String[] args)
	{
		try 
		{
			int div = 55 / 0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Exception cannot resist my running");
	}

}
