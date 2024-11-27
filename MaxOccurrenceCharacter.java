import java.util.Scanner;

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter a string:");
        String input = sc.nextLine();
        int[] charCounts = new int[256]; 
        for (char c : input.toCharArray()) {
            charCounts[c]++;
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxChar = (char) i;
                maxCount = charCounts[i];
            }
        }

        
        System.out.println("maximum occurrence: " + maxChar);
        System.out.println("Occurrences: " + maxCount);

       
    }
}
