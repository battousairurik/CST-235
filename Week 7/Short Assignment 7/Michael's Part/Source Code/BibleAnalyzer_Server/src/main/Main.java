package main;

import ws.*;
import javax.xml.ws.*;

public class Main {

	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:8080/ws/WordOccurrenceService", new WordOccurrenceServiceImpl());
			System.out.print("Done");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
