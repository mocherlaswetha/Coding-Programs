package exception;
class ParentException{
	void printep() {
		System.out.println("it is parent method");
	}
}
public class OverridingException extends ParentException{
	void printep() {
		System.out.println("it is child method");
	}
          public static void main(String[] args) {
        	  
        	  ParentException p= new ParentException();
        	  try
        	  {
        		  p.printep();
        	  }
        	  catch(Exception e) {
        		  System.out.println(e);
        	  }
        	  OverridingException t=new OverridingException();
        	  try
        	  {
        		  t.printep();
        	  }
        	  catch(Exception e) {
        		  System.out.println(e);
        	  }
        	  
		}
}
