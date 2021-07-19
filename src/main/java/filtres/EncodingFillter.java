package filtres;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodingFillter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)  servletRequest;
        HttpServletResponse resp = (HttpServletResponse)  servletResponse;

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        filterChain.doFilter(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Filter destoryed!");
    }
}
