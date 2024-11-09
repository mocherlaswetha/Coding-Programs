package javaprograms;
import java.util.*;
public class linear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n =sc.nextInt();
		int pos=0;
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter element");
			a[i]=sc.nextInt();
		}
		System.out.println("enter key");
		int key=sc.nextInt();
		
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
			pos=i+1;
			break;
			}
			}
		
			if(pos>0){
			System.out.println("Successful search");
			System.out.println(key+" found at position "+pos);
			}
			else{
			System.out.println("Unsuccessful search");
			}
		
	}

}
