package day1;
import java.util.*;
public class largestofthreebyif {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is larger");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println(b+" is larger");
			}
		}
		else {
			System.out.println(c+" is larger");
		}
			
		
		
	}

}
