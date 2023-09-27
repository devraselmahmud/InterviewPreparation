package exception_handling;

public class ImpException {
	
	public static void main(String... args) {
		
		System.out.println(1);
		
		try {
			
			System.out.println("2");
			int a=50, b=0, c;
			System.out.println("3");
			c=a/b;
			//Below statements of try block will not print
			System.out.println("4");
			System.out.println(c);
			System.out.println("5");
			
		}catch(ArithmeticException e) {
			
			System.out.println("6");
			System.out.println(e);
			System.out.println("7");
		}
		
		System.out.println("I can run too!");
	}

}
