package day1;
import java.util.*;
public class arm {
	public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,count=0;
		int n1=n;
		int n2=n;
		while(n>0) {
			count++;
			n=n/10;
			
		}
		int result=0;
		while(n1>0) {
			int a=n1%10;
			result=(int)Math.pow(a,count)+result;
			n1=n1/10;
		}
		if(n2==result) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
