package oopscocept;
public class OverloadNoOfArg {
	
void add(int i, int j) {
int s=i+j;
System.out.println("int sum of two int values ="+s);
}
void add(short i, short j) {
int s=i+j;
System.out.println("short sum of two int values ="+s);
}
void add(long i, long j) {
long s=i+j;
System.out.println("long sum of two int values ="+s);
}
void add(float i, float j) {
float s=i+j;
System.out.println("float sum of two int values ="+s);
}
void add(double i, double j) {
double s=i+j;
System.out.println("double sum of two int values ="+s);
}
void add(byte i, byte j) {
int s=i+j;
System.out.println("byte sum of two int values ="+s);
}


/*void add(int i, int j, int k) {
int s=i+j+k;
System.out.println("sum of three int values ="+s);
}*/

public static void main(String[] args) {
OverloadNoOfArg obj = new OverloadNoOfArg();
obj.add(3, 23);
obj.add(3f, 23f);
obj.add((long)3,(long) 23);
obj.add((byte)3,(byte) 23);
obj.add(3.0,23.0);
obj.add((short)3,(short)89);
}


}
