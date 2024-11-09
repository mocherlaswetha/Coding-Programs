package javaprograms;

import java.util.Scanner;

public class arrayoperation {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		int a[] = new int[n];
		int i=0;
		int sum=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println("sum:"+sum);
		System.out.println("average:"+(float)sum/n);
		/*for(i=0;i<n;i++) {
			//a[i]=sc.nextInt();
			System.out.println(a[i]);
		}*/

}
}
