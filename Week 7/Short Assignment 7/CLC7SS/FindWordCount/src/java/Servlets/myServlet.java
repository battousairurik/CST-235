package Servlets;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.countBean;
import javax.servlet.RequestDispatcher;


@WebServlet(urlPatterns = {"/myServlet"})
public class myServlet extends HttpServlet {
    
   //gets post request from index and finds the chosen word
    public void service(ServletRequest request, ServletResponse response)
        throws ServletException, IOException {
        
        //create bean
        countBean bean = new countBean();
        
        //word to find
        String aWord = request.getParameter("aWord");
        
        //tries to create a reader and read from Genesis.txt
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\xdark\\Documents\\FindWordCount\\src\\java\\textFile\\Genesis.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int count = 0;
            
            //while the line is not empty, split the line into an array by spaces
            while (line != null) {
                String[] word = line.split(" ");
                for(int i = 0; i < word.length; i++){
                    if(word[i].equals(aWord) 
                            || word[i].equals(aWord + ".") 
                            || word[i].equals(aWord + '.' + '”')
                            || word[i].equals(aWord + ',')){
                        count++;
                    }
                }
                line = br.readLine();
            }
            bean.setCount(count);
            request.setAttribute("bean", bean);
            RequestDispatcher r = request.getRequestDispatcher("DisplayContinue.jsp");
            r.forward(request,response);
    
    }
    }


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet myServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet myServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
