package javaprograms;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n =sc.nextInt();
		//int pos=0;
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter element");
			a[i]=sc.nextInt();
		}
		System.out.println("enter key");
		int key=sc.nextInt();
		int s=0;
		int e=n-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==key) {
				System.out.println((mid+1)+" is postion of key "+key);
				break;
			}
			else if(a[mid]<key) {
				s=mid+1;
			}
			else if(a[mid]>key) {
				e=mid-1;
			}
		}
		
	}

}
