package day1;
import java.util.Scanner;

public class positivenumber{
 
	 	public static void main(String args[]) {
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("enter number");
	 		  int a=sc.nextInt();
	 		   if(a>0 ) {
	 			   System.out.println("positive number");
	 		   }
	 		   else if(a<0) {
	 			   System.out.println("negative number");
	 		   }
	 		   else {
	 			  System.out.println("zero");
	 		   }
	 	}
	 	

	 

 
}
