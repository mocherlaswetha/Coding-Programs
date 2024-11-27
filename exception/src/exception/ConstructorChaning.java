package exception;
//Parent class
class Demo {
 // Default constructor
 public Demo() {
     this(80, 50); // Calling parameterized constructor of the same class
     System.out.println("Base class default constructor called");
 }

 // Parameterized constructor
 public Demo(int no1, int no2) {
     System.out.println("Base class parameterized constructor called");
     System.out.println("no1: " + no1);
     System.out.println("no2: " + no2);
 }
}

//Child class
class ProtoType extends Demo {
 // Default constructor of child class
 public ProtoType() {
     this("Java", "Python"); // Calling parameterized constructor of the child class
     System.out.println("Derived class default constructor called");
 }

 // Parameterized constructor of child class
 public ProtoType(String str1, String str2) {
     super(); // Calling default constructor of the parent class
     System.out.println("Derived class parameterized constructor called");
     System.out.println("str1: " + str1);
     System.out.println("str2: " + str2);
 }

 public static void main(String[] args) {
     // Creating an object of ProtoType to see constructor chaining in action
     ProtoType prototype = new ProtoType();
 }
}

