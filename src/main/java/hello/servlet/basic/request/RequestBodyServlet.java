package hello.servlet.basic.request;

import org.springframework.boot.jdbc.DataSourceUnwrapper;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyServlet", urlPatterns = "/request-body-string")
public class RequestBodyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream servletInputStream = req.getInputStream();
        String messageBody = StreamUtils.copyToString(servletInputStream, StandardCharsets.UTF_8);

        System.out.println(messageBody);

        resp.getWriter().write(messageBody);
    }
}
