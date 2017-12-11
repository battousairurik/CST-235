package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadInitParamServlet
 */
@WebServlet("/ReadInitParamServlet")
public class ReadInitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, String> initParamsMap = new HashMap<String, String>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadInitParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {

		Enumeration<String> initParams = getServletConfig().getInitParameterNames();
		System.out.println(initParams + " initParams");

		while (initParams.hasMoreElements()) {

			String initParamName = initParams.nextElement();
			System.out.println(initParamName + " initParamName");
			String initParamValue = getServletConfig().getInitParameter(initParamName);

			initParamsMap.put(initParamName, initParamValue);

		}

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");

		Iterator<Map.Entry<String, String>> iter = initParamsMap.entrySet().iterator();

		while (iter.hasNext()) {

			Map.Entry<String, String> entry = iter.next();
			String key = entry.getKey();
			String value = entry.getValue();

			out.write(key);
			out.write(" = ");
			out.write(value);
			out.write("n");

		}

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
