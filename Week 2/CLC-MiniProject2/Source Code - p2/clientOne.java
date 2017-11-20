package ejbPortability;

public class clientOne {

	private enterpriseBean clientOneBean = new enterpriseBean();
	
	public clientOne (){
		clientOneBean.setEJBString("This bean belongs to Client One.");
	}
	
	public enterpriseBean getClientOneBean (){
		return clientOneBean;
	}
}
