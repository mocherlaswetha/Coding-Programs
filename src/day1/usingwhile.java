package day1;

import java.util.Scanner;

public class usingwhile {
	  public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   int n= sc.nextInt();
		   int i=2;
		   int a=0,b=1,c=a+b;
		   System.out.println(a);
		   System.out.println(b);
		   while(i<n) {
			   a=b;
			   b=c;
			   System.out.println(c);
			   c=a+b;
			   i=i+1;
			   
		   }
	  }

}
