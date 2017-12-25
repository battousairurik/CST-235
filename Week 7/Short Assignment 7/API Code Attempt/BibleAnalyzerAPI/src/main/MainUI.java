package main;
/*
import verseSearch.application.Main;
import FindWordCount.*;
import BibleAnalyzer_Client.main.Main;

I cannot seem to get this to function properly, i do not currently have enough knowledge to do so
*/
public class MainUI {

	public static void main(String[] args) {
		
		/*
		 * I would prefer to create an interface that can individually call each aspect of the project
		 * but i am forced to simply generate a method call for each one
		 */
		
		callVerseSearch();
		callFindWordCount();
		callWordOccurrence();
	}

	public static void callVerseSearch (){
		//verseSearch search = new verseSearch();
		//search.main();
	}
	public static void callFindWordCount (){
		//FindWordCount findCount = new FindWordCount();
		//findCount.index;
	}
	public static void callWordOccurrence (){
		//BibleAnalyzer_Client findOccurrence = new BibleAnalyzer();
		//findOccurrence.main();
	}
}
