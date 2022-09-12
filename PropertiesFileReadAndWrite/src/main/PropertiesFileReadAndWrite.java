package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesFileReadAndWrite {  
	   public static void main(String args[]) throws IOException { // Main method.
	      Properties props = new Properties();   // properties is extension from java.
	      props.put("Name", "Sutharsan");		 // Fill the properties file.
	      props.put("Age", "22");
	      props.put("Contact", "9999999999");
	      props.put("Address", "Alangudi, pudukkottai");	
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the path of the file save location, file name and file type :");
	      String path = sc.nextLine();		 // Create string variable path and add path to store the file. 
	      FileOutputStream outputStrem = new FileOutputStream(path);		 //Instantiating the FileInputStream for output file
	      props.store(outputStrem, "Details of Persion");					 //Storing the properties file
	      System.out.println("Text file is created......");
	   }
	}

