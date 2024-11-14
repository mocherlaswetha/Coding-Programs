package oopscocept;
import java.util.*;
public class Opps{
	 public static void main(String args[]) {
		 Employee st = new Employee();
		 st.input();
		 st.output();
	 }

}
class Employee{
	
	String ename;
	int id;
	int esalary;
	String dep;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		ename=sc.next();
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter salary");
		esalary= sc.nextInt();
		System.out.println("Enter department");
		dep=sc.next();
	}
	void output(){
		System.out.println("Name="+ename);
		System.out.println("ID="+id);
		System.out.println("salary ="+esalary);
		System.out.println("ID="+dep);
		
	}
}
