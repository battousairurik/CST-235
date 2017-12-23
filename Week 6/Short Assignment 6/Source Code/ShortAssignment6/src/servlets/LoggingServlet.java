package servlets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Incomplete Attempt, currently has no functionality
 */
@WebServlet("/LoggingServlet")
public class LoggingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilterConfig config;
	
    public LoggingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init (FilterConfig filterConfig)throws ServletException{
		this.config = filterConfig;
	    config.getServletContext().log("Beginning Log Capture...");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	public void doFilter (ServletRequest request, ServletResponse response,  FilterChain chain) throws java.io.IOException, ServletException {
		HttpServletRequest req = null;
	    req = (HttpServletRequest) request;
	    config.getServletContext().log("Request received from: "  + req.getRemoteHost() + " for " + req.getRequestURL());
	    readFile();
	    chain.doFilter(request, response);
	}
	public void readFile (){
		BufferedReader reader;
        String filename="d:\\test.xml";
        try {
             reader = new BufferedReader( new FileReader(filename));
        }
        catch (Throwable err) {
            config.getServletContext().log("Error thrown by readFile method",err);  // captures error.
        }
	}
}
