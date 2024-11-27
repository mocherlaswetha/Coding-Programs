package exception;

public class Exceptionhandling {

	void arthmeticDemo(){
		try {
			int r=100/0;
			//System.out.println(r);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("its handling arithmetic exception");
			
		}
		//System.out.println("its handling arithmetic exception");
		
	}
	void StringNull(){
		try {
			String str=null;
			
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("its handling  Null exception");
		
	}
	void Arrayindex(){
		try {
			int a[]=new int[5];
			
			System.out.println(a[8]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("its handling  array index exception");
		
	}
	void multicatch() throws ArrayIndexOutOfBoundsException,NullPointerException,ArithmeticException{
		try {
			int a[]=new int[5];
			
			System.out.println(a[8]);
              String str=null;
			
			System.out.println(str.length());
			int r=100/0;
			System.out.println(r);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
		
	}
	public static void main(String[] args) {
		Exceptionhandling e= new Exceptionhandling();
		
		e.arthmeticDemo();/*
		e.StringNull();
		e.multicatch();*/
	}
}

	

