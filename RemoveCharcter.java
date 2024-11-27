import java.util.Scanner;

public class RemoveCharcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        char c=sc.next().charAt(0);
        int firstIndex = input.indexOf(c);
        int lastIndex = input.lastIndexOf(c);

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == firstIndex || i == lastIndex) {
                continue; 
            }
            result.append(input.charAt(i));
        }

        System.out.println(result.toString());
     
    }
}
