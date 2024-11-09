package javaprograms;
import java.util.*;

public class primenumbers {
    public static void main(String args[]) {
        int num = 100;
        int count = 0;
        while (count < 5) {
            int c = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    c++; 
                }
            } 
            if (c == 2) {
                System.out.println(num);
                count++; 
            }

            num--; 
       }
}
}
