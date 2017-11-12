
public class Main {

	public static void main(String[] args) {
		
		FileReader option = new FileReader("src\\Reading.txt");
		entityBean thisBean = option.getEntityBean();
		
		System.out.println("The sum of the numbers in the file is: " 
				+ thisBean.getSumOfNumbers());
		System.out.println("The total number of words is: "
				+ thisBean.getNumOfWords());
		System.out.println("The total number of characters are: "
				+ thisBean.getNumOfCharacters());
	}

}
