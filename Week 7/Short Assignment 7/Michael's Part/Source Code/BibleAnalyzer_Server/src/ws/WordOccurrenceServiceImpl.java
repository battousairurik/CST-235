package ws;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.jws.*;

@WebService(endpointInterface = "ws.WordOccurrenceService")
public class WordOccurrenceServiceImpl implements WordOccurrenceService{
	
	private File currentFile;
	public void setFile (String filePath){
		if (filePath != null){
			currentFile = new File (filePath);
		}
		else
			setDefaultFile();
	}
	public String[] findWord(String word) {
		
		String [] verseInfo = new String [3];
		
		try {
			Scanner inputStream = new Scanner (currentFile);
			verseInfo[0] = currentFile.getName();
			verseInfo[2] = inputStream.nextLine();
			
			while (inputStream.hasNext()){
				String verseWord = inputStream.next();
				if (isInteger(verseWord) == true){
					verseInfo[1] = verseWord;
				}
				if (verseWord == word){
					break;
				}
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	private boolean isInteger (String str){
		if (str == null) {
	        return false;
	    }
	    int length = str.length();
	    if (length == 0) {
	        return false;
	    }
	    int i = 0;
	    if (str.charAt(0) == '-') {
	        if (length == 1) {
	            return false;
	        }
	        i = 1;
	    }
	    for (; i < length; i++) {
	        char c = str.charAt(i);
	        if (c < '0' || c > '9') {
	            return false;
	        }
	    }
	    return true;
	}
	private void setDefaultFile (){
		currentFile = new File ("src\\biblePassages\\Genesis1.txt");
	}
}
