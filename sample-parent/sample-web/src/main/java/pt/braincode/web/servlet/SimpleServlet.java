package pt.braincode.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by sergioletras on 27/03/16.
 */
@WebServlet(value = "/sample", name = "hello-sample")
public class SimpleServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().print("Hello sample");
    }
}
