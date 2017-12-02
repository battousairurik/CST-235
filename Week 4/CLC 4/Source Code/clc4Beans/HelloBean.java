package clc4Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name = "managedBean", eager = true)
@RequestScoped
public class HelloBean {

	private String message;
	
	public HelloBean (){
		setMessage("Hello World");
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
