package navigationBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean (name = "questionBean", eager = true)

public class questionBean {

	//Bean private fields
	private String beanQuestion;
	private questionBean yesNode;
	private questionBean noNode;
	private String answer;
	
	//Bean constructors
	public questionBean() {	}
	public questionBean (String message) {
		beanQuestion = message;
	}
	
	//Bean get and set methods
	public String getBeanQuestion() {
		return beanQuestion;
	}
	public void setBeanQuestion(String beanQuestion) {
		this.beanQuestion = beanQuestion;
	}
	public questionBean getYesNode() {
		return yesNode;
	}
	public void setYesNode(questionBean yesNode) {
		this.yesNode = yesNode;
	}
	public questionBean getNoNode() {
		return noNode;
	}
	public void setNoNode(questionBean noNode) {
		this.noNode = noNode;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	//Bean navigation logic
	
}
