package day1;

import java.util.Scanner;

public class evenodd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		  int a=sc.nextInt();
		   if(a%2==0 && a!=0 ) {
			   System.out.println("even");
		   }
		   else {
			   System.out.println("odd");
		   }
	}
	

}
