import java.io.Serializable;

public class entityBean implements Serializable{

	//Default Serialization number
	private static final long serialVersionUID = 1L;

	public entityBean (){}
	
	private int numOfCharacters = 0;
	private int numOfWords = 0;
	private int sumOfNumbers = 0;
	
	public void setNumOfCharacters (int number){
		numOfCharacters = number;
	}
	public int getNumOfCharacters (){
		return numOfCharacters;
	}
	
	public void setNumOfWords (int number){
		numOfWords = number;
	}
	public int getNumOfWords (){
		return numOfWords;
	}
	
	public void setSumOfNumbers (int number){
		sumOfNumbers = number;
	}
	public int getSumOfNumbers (){
		return sumOfNumbers;
	}
	
	public void incrimentNumOfCharacters(int x){
		numOfCharacters += x;
	}
	public void incrimentNumOfWords(){
		numOfWords++;
	}
	public void incrimentSumOfNumbers(int x){
		sumOfNumbers += x;
	}
}
