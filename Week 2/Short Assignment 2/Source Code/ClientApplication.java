import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ClientApplication {

	private entityBean myBean = new entityBean();
	
	public void readFile (String fileName){
		File nameOfFile = new File (fileName);
		myBean = new entityBean();
		try {
			Scanner inputstream = new Scanner (nameOfFile);
			while (inputstream.hasNext()){
				String data = inputstream.next();
				boolean decision = isInteger(data);
				if (decision == true){
					myBean.incrimentSumOfNumbers(Integer.parseInt(data));
				}
				else if (decision == false){
					myBean.incrimentNumOfWords();
					myBean.incrimentNumOfCharacters(data.length());
				}
			}
			inputstream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean isInteger (String input){
		 if (input == null) {
		     return false;
		 }
		 int length = input.length();
		 if (length == 0) {
		     return false;
		 }
		 int i = 0;
		 if (input.charAt(0) == '-') {
		     if (length == 1) {
		         return false;
		     }
		     i = 1;
		 }
		 for (; i < length; i++) {
		     char c = input.charAt(i);
		     if (c < '0' || c > '9') {
		         return false;
		     }
		 }
		 return true;
	}
	
	public entityBean getEntityBean (){
		return myBean;
	}
}
