package javaprograms;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		int i=0,count=0;
		for(i=0;i<str.length();i++) {
			char c=str.charAt(i);
		
			if(c=='a'||c== 'e'||c== 'i' || c== 'o' ||c== 'u'||c=='A'||c== 'E'||c== 'I' || c== 'O' ||c== 'U')
				{
				    count++;
				}
		}
		System.out.println(count);
	}

}
