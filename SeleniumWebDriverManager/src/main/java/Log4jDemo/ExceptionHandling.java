package Log4jDemo;

public class ExceptionHandling {
public static void main(String[] args) {
	try {
		demo();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public static void demo() throws Exception{
		System.out.println("Hellow World");
		int i = 1/0;
		System.out.println("completed");
	}
	
//	try{
//		System.out.println("Hellow World");
//		int i = 1/0;
//		System.out.println("completed");
//	}
//	catch(Exception ex) {
//		System.out.println("i am inside catch block");
//		System.out.println("The message is: "+ex.getMessage());
//		System.out.println("The cause is: "+ex.getCause());
//		ex.printStackTrace();
//	}
//	finally {
//		System.out.println("I am inside finally block");
//	}
	

}
