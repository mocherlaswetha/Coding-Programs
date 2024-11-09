package javaprograms;

import java.util.Scanner;

public class reversEveryword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String str1[] = str.split(" ");
	/*	String s=str1[0].charAt(0)+"."+str1[1].charAt(0)+"."+str1[2];
		System.out.println(s);
		*/
		int i=0,j=0;
		
		for(i=0;i<str1.length;i++) {
			StringBuffer sb= new StringBuffer(str1[i]);
			System.out.print(sb.reverse().toString());
			
		/*for(j=str1[i].length()-1;j>=0;j--) {
			System.out.printf("%c",str1[i].charAt(j) );
		}*/
		System.out.print(" ");
		}

}
}
