package oopscocept;

public class FunctionOverloading {
void display(int i) {
System.out.println("Integer type");
}

void display(float i) {
System.out.println("float type");
}

void display(double i) {
System.out.println("double type");
}
void display(short i) {
System.out.println("short type");
}
void display(byte i) {
System.out.println("byte type");
}

void display(long i) {
System.out.println("long type");
}
public static void main(String[] args) {
FunctionOverloading fobj = new FunctionOverloading();
fobj.display(5); //int
fobj.display(45.6f); //float
fobj.display(45.6);//double
fobj.display((short)45);
fobj.display((byte)4);
fobj.display((long)4); //
fobj.display(4l);

}


}
