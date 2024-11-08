package day1;
import java.util.*;
public class electricitybill {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter name");
	 String name=sc.next();
	 System.out.println("enter units");
	 int n=sc.nextInt();
	 double bill=0;
	 if(n<=100 && n>0) {
		 bill=n*2;
	 }
	 else if(n>100 && n<=200) {
		bill=100*2+(n-100)*3;
	 }
	 else if(n>300) {
		bill=100*2+200*3+(n-300)*5;
	 }
	 System.out.println(name+" billed with"+bill);
 }
}
