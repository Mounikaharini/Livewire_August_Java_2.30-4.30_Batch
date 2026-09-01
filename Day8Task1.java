package TheoryClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day7Task1 {

public static void createFile(String filePath) {
		System.out.println("Create a file");
		File file = new File(filePath);
		try {
			if (file.createNewFile()) {
				// file.createNewFile();
				System.out.println("File created");
			} else {
				System.out.println("File already created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
public static void createFolder(String folderPath) {
	
	System.out.println("create a folder");
	
	File folder = new File(folderPath);
	if (folder.mkdir()) {
		System.out.println("Folder created");
	} else {
		System.out.println("Folder already created");
	}
}
public static void writeFile(String filePath) {
	System.out.println("Write a file");
	FileWriter fw;
	try {
		fw = new FileWriter(filePath,true);
		fw.write("HELLO WORLD");
		System.out.println("Written successfully");
		fw.flush();
	}  
	catch (IOException e) {
		e.printStackTrace();
	}
}
public static void readFile(String filePath) {
	System.out.println("Read a file");
	File file = new File(filePath);
	try {
		Scanner read = new Scanner(file);
		while(read.hasNextLine()) {
			String data = read.nextLine();
		System.out.println(data);
		}
		read.close();
	}
	catch(Exception e) {
		e.printStackTrace();}
	}
public static void deleteFile(String filePath) {
	
	System.out.println("Delete a file");
	
	File file = new File(filePath);
	if(file.delete()) {
		System.out.println("File is deleted");
	}
	else {
		System.out.println("File is not deleted");
	}
}

	public static void main(String[] args) {
		
		String file = "C:\\Users\\Live Wire\\Desktop\\m2.doc";
		File a = new File(file);
//		System.out.println(a);
//		createFile(file);
//		String file1= "C:\\Users\\Live Wire\\Desktop\\HI";
//		createFolder(file1);
//		writeFile(file);
//		readFile(file);
		deleteFile(file);
	}

}
