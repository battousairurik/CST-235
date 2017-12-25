package ws;

import javax.jws.*;

@WebService
public interface WordOccurrenceService {

	@WebMethod
	public String [] findWord(String word);
}
