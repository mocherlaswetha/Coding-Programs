package day1;
import java.util.*;
public class factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int fact=1;
		/* int i=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		}*/
	int j=1;
	while(j<=n) {
		fact=fact*j;
		j++;
	}
	System.out.println(fact);
	

}
}
