package day1;

import java.util.Scanner;

public class Biggestnumber {
	public static void main(String args[]) {
	
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("to find biggest number among \n 2-press:1\n3-press:2\n 4-press:3");
		  int op=sc.nextInt();
		  switch(op) {
		  case 1:
		       System.out.println("enter number");
			  int a=sc.nextInt();
			  System.out.println("enter number");
			   int b=sc.nextInt();
			   int big = (a>b)?a:b;
			   System.out.println("The largest number is :"+big);
			  break;
		  case 2:
			  System.out.println("enter number");
			   int a1=sc.nextInt();
			   System.out.println("enter number");
		       int b1=sc.nextInt();
		       System.out.println("enter number");
		         int c1=sc.nextInt();
	       int big1 = (a1>b1 && a1>c1)?a1:(b1>a1 && b1>c1)?b1:c1;
	       System.out.println("The largest number is :"+big1);
	       break;
		  case 3:
			  System.out.println("enter number");
			   int a12=sc.nextInt();
			   System.out.println("enter number");
		       int b12=sc.nextInt();
		       System.out.println("enter number");
		         int c12=sc.nextInt();
		         System.out.println("enter number");
		         int d=sc.nextInt();
	 int big12 = (a12>b12 && a12>c12 &&a12>d)?a12:(b12>a12 && b12>c12 && b12>d)?b12:(c12>a12 && c12>b12 && c12>d)?c12:d;
	       System.out.println("The largest number is :"+big12);
	       break;
	
	}
	}

}
