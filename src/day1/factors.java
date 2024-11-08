package day1;
import java.util.*;
public class factors {
   public static void main(String args[]) {
	   Scanner sc =new Scanner(System.in);
	   int n=sc.nextInt();
	   int i=1;
	  // int count=0;
	   for(i=1;i<=n;i++) {
		   if(n%i==0) {
			   System.out.println(i);
			  
		   }
	   }
	  
	   
   }
}
