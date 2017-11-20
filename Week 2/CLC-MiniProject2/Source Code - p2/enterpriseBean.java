package ejbPortability;

public class enterpriseBean {

	public enterpriseBean(){}
	
	private String ejbString;
	
	public void setEJBString(String message){
		ejbString = message;
	}
	public String getEJBString(){
		return ejbString;
	}
}
