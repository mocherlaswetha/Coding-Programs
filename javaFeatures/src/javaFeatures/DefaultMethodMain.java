package javaFeatures;
//default method in interface
interface MyInterface{
void add();
//java 8 features
default void display() {
System.out.println("Display method");
}
}


class MyClass implements MyInterface{


@Override
public void add() {
System.out.println("Add method");

}

}


public class DefaultMethodMain {


public static void main(String[] args) {
MyClass mobj = new MyClass();
mobj.add();
mobj.display();


}


}
