package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {  
    public static void main(String[] args) { 
        // Specify the file path
        File myFile = new File("D:FileOperationExample.txt");

        try {  
            // Create a scanner to read the file
            Scanner dataReader = new Scanner(myFile);  
            
            // Read the file line by line and print each line
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            // Close the scanner
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            // Handle the case where the file is not found
            System.out.println("Unexpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}
