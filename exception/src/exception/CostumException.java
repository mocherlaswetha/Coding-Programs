package exception;

public class CostumException{
 public static void main(String[] args) {
	try {
		int age=16;
		if(age<18) {
			throw new MyCostumException("invalid exception");
		}
		System.out.println("try");
	}
	catch(MyCostumException e) {
		System.out.println(e);
	}
}
}
