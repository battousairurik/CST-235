package ejbPortability;

public class clientTwo {

	private enterpriseBean clientTwoBean = new enterpriseBean();
	
	public clientTwo (){
		clientTwoBean.setEJBString("This bean belongs to Client Two.");
	}
	
	public enterpriseBean getClientTwoBean (){
		return clientTwoBean;
	}
}
