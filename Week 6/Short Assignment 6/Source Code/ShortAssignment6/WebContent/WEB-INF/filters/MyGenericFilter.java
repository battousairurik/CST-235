package filters;

import javax.servlet.*;

public class MyGenericFilter implements javax.servlet.Filter {
  public FilterConfig filterConfig;                                 

  public void doFilter(final ServletRequest request,                
                       final ServletResponse response,
                       FilterChain chain)
      throws java.io.IOException, javax.servlet.ServletException { 
    chain.doFilter(request,response);                               
  } 

  public void init(final FilterConfig filterConfig) {               
    this.filterConfig = filterConfig;
  } 

  public void destroy() {                                           
  }
}
