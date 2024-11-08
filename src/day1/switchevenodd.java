package day1;
import java.util.*;
public class switchevenodd {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int res=n%2;
		switch(res) {
			case 0:System.out.println(n+ "is even number");
			break;
			case 1:System.out.println(n+ "is odd number");
			break;
	}
	}

}
