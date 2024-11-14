package oopscocept;



class Demo{
private int i;
private int j;

public int getI() {
return i;
}
public void setI(int i) {
this.i = i;
}
public int getJ() {
return j;
}
public void setJ(int j) {
this.j = j;
}




}


public class EncapsulationDemo {
public static void main(String[] args) {
Demo obj = new Demo();
obj.setI(23);
obj.setJ(89);

System.out.println("value of i="+obj.getI());
System.out.println("Value of j="+obj.getJ());


}


}
