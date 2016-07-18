package utour.travel.filter;

import javax.servlet.*;
import java.io.IOException;

/*
-----------------------
* 类名称：AuthFilter
* 描述：
* 创建日期：2016/7/14
* 创建者：yuanjinan
* http://jumpbyte.com/
--------------------------
*/
public class AuthFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
