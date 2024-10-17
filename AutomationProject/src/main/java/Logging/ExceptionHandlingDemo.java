package Logging;

public class ExceptionHandlingDemo {

	public static void main(String[] args){

		
		try {
			f1();
		}
		
		catch(Exception e) {
			System.out.println("I'm inside catch after throw:" + e.getMessage());
		}
		
		
		
		try {
			System.out.println("Hi  !! ");
			int i = 11/0;
			
			System.out.println("Bye  !! ");
		}
		
		catch(Exception exp) {
			
			System.out.println("Message is :" + exp.getMessage());
			System.out.println("Cause is :" + exp.getCause());
			//exp.getStackTrace();
		}

		finally {
			System.out.println("Finally Exception 1 !! ");
			
		}
		
	
	
	}
		
	public static void f1() throws Exception {
		
			System.out.println("Hi Function 1 ");
			int z =77/0;
			System.out.println("Bye  Function 1 ");

		}
	}


