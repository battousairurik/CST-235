package projectBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "pageController")
@SessionScoped
public class PageController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String moveToPage2 (){
		return "NavigationExample2";
	}
	public String moveToPage1 (){
		return "NavigationExample1";
	}
}
