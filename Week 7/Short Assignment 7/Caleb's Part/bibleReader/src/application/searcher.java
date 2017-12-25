package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class searcher {	
	
	public static void main(String[] args) throws IOException {
		try {
			Scanner file = new Scanner(new 
				File("C:\\Users\\gage_\\eclipse-workspace\\textReader\\src\\application\\Gen.txt"));
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter Verse: ");
			int n = reader.nextInt();
			
			reader.close();
	        
	        while (file.hasNextLine()) {

	        	System.out.print(file.nextLine());
	        	if (file.equals(reader)) {
	        		System.out.println(reader.nextLine());
	        	}
	        }
	        file.close();
	        
	                
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
        
		
    }
}

