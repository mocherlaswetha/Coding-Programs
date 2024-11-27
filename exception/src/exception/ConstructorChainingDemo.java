package exception;

public class ConstructorChainingDemo {

    // Default Constructor
    public ConstructorChainingDemo() {
        this("Bona");
        System.out.println("Inside default constructor");
    }

    // Parameterized Constructor with String
    public ConstructorChainingDemo(String name) {
        this(10);
        System.out.println("Inside String parameterized constructor");
        System.out.println("Hello " + name);
    }

    // Parameterized Constructor with int
    public ConstructorChainingDemo(int no) {
        this(no, "Snoma");
        System.out.println("Inside int parameterized constructor");
        System.out.println("no = " + no);
    }

    // Parameterized Constructor with int and String
    public ConstructorChainingDemo(int no, String name) {
        System.out.println("Inside int and String parameterized constructor");
        System.out.println("no = " + no);
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        // Creating an object to test constructor chaining
        ConstructorChainingDemo demo = new ConstructorChainingDemo();
    }
}
