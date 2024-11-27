package fileHandling;

import java.io.File;
import java.io.IOException;

public class create {
public static void main(String[] args) {
	File newFile = new File("my_new_file.txt");
	try {
	if (newFile.createNewFile()) {
	System.out.println("File created successfully!");
	} else {
	System.out.println("File already exists.");
	}
	} catch (IOException e) {
	e.printStackTrace();
	}
}
}
