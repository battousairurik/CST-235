package ejbPortability;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clientOne first = new clientOne();
		clientTwo second = new clientTwo();
		System.out.println(first.getClientOneBean().getEJBString());
		System.out.println(second.getClientTwoBean().getEJBString());
	}

}
