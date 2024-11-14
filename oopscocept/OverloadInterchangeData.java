package oopscocept;


public class OverloadInterchangeData {
void display(int i, float j) {
System.out.println("int and float ");
}
//int display(int i, float j) { //based on return we cannot overload the method
//System.out.println("int and float ");
//return 9;
//}
void display(float j, int i) {
System.out.println("float and int ");
}

public static void main(String[] args) {
OverloadInterchangeData obj = new OverloadInterchangeData();
obj.display(56,56.4f); //add(int, float)
obj.display(56.4f,78); //ad(float,int)


}


}

