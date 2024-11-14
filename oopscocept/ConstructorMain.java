package oopscocept;
import java.util.*;
public class ConstructorMain {

int i, j;
public ConstructorMain() { //constructor with no argument
System.out.println("Constructor is called");
}

public ConstructorMain(int i, int j) { //constructor with argument
this.i = i;
this.j = j;

}

void add() {
int s=i+j;
System.out.println("sum of "+i+" and "+j+" is "+s);
}


public static void main(String[] args) {
System.out.println("main Method");

ConstructorMain obj = new ConstructorMain();
ConstructorMain obj1 = new ConstructorMain(8,9); 
obj.add();

obj1.add();

}


}

