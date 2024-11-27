package fileHandling;

import java.io.File;
//Importing the FileWriter class  
import java.io.FileWriter;   

import java.io.IOException;   

class writeToFile {  
 public static void main(String[] args) {  
   
 try {  
     FileWriter fwrite = new FileWriter("D:FileOperationExample.txt"); 
     File f0 = new File("D:FileOperationExample.txt");  
     
     // writing the content into the FileOperationExample.txt file  
     fwrite.write("A named location used to store related information is referred to as a File.");   
     
     // Closing the stream  
     fwrite.close();   
     System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
     System.out.println("Content is successfully wrote to the file.");  
 } catch (IOException e) {  
     System.out.println("Unexpected error occurred");  
     e.printStackTrace();  
     }  
 }  
}  
