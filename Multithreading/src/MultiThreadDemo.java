class myClass extends Thread{
	public void run() {
		System.out.print("running"+Thread.currentThread());
	}
}
public class MultiThreadDemo {
public static void main(String[] args) {
	System.out.println("Jvm"+Thread.currentThread());
	myClass m=new myClass();
	m.start();
	m.setName("1");
	myClass m1=new myClass();
	m1.start();
	m.setName("2");
}
}
