package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
/*    public void doGet(HttpServletRequest request,HttpServletResponse response){
        try{
            response.getWriter().println("<h1>Login Servlet<h1>");
        }catch(IOException e){
            e.printStackTrace();
        }
    }*/

    //在login.html中指定了是post方法
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException {
        String name=request.getParameter("name");
        String password=request.getParameter("password");


        String html=null;
        if("admin".equals(name)&&"123".equals(password))
            html="<div style ='color:green '>success</div>";
        else
            html="<div style ='color:red '>fail</div>";

        //注意用PrintWriter写的是html语句，通过response对象获得
        PrintWriter pw=response.getWriter();
        pw.println(html);

        System.out.println("name:"+name);
        System.out.println("password"+password);
    }
}
