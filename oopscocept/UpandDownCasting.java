package oopscocept;
class Emp{
	void print() {
		System.out.println("Emp");
	}
}
class Manager extends Emp{
	void print() {
		System.out.println("Manager");
	}
}
public class UpandDownCasting {
	public static void main(String args[]) {
		Emp p=new Manager(); //upcasting
		Manager m=(Manager)p;//downcasting
		p.print();
		m.print();
	}

}
