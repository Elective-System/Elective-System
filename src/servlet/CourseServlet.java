package servlet;

import javax.servlet.http.*;
import java.io.IOException;

public class CourseServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response){
        try{
            response.getWriter().println("<h1>Login Servlet<h1>");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}