package day1;
import java.util.*;
public class fib {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int n= sc.nextInt();
	   int i=0;
	   int a=0,b=1,c=a+b;
	   System.out.println(a);
	   System.out.println(b);
	   for(i=2;i<n;i++) {
		   a=b;
		   b=c;
		   System.out.println(c);
		   c=a+b;
		   
	   }
   }
}
