package package1;

interface Intf1{ //usnig interface we can achieve 100%
int i=10; //public static final
void m1(); //by default methods are public abstract
void m2();
}


class MyClass implements Intf1{


@Override
public void m1() {
System.out.println("m1 method of interface");

}


@Override
public void m2() {

System.out.println("m2 method of interface");
}

}


public class MainApp {


public static void main(String[] args) {
MyClass obj = new MyClass();
obj.m1();
obj.m2();
}


}