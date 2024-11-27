package exception;


public class NestedTryCatchDemo {

    void testNestedTry() {
        try {
            // Outer try block
            try {
                // Inner try block
                System.out.println("Divide by zero operation:");
                int no = 90 / 0;  // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                // Catch block for inner try
                System.out.println("ArithmeticException caught: " + e);
            }

            try {
                // Another inner try block
                int[] arr = new int[3];
                System.out.println("Accessing array element out of bounds:");
                System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catch block for ArrayIndexOutOfBoundsException
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
            }

        } catch (Exception e) {
            // Outer catch block for any other exceptions
            System.out.println("Exception caught in outer try block: " + e);
        }

        System.out.println("End of the testNestedTry method");
    }

    public static void main(String[] args) {
        NestedTryCatchDemo demo = new NestedTryCatchDemo();
        demo.testNestedTry();
    }
}
