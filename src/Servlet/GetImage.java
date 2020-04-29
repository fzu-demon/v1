package Servlet;


import method.Geturl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Post url,get json message
 * author:yzl
 * data:2020/4/27
 */
@WebServlet("/getimage")
public class GetImage extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(1);
        String method = req.getParameter("method");
        switch (method){
            case "getimage":
                List<String> urls = Geturl.geturl();
//                for(String s:urls){
//                    System.out.println(s);
//                }
                req.setAttribute("urls",urls);
                req.getRequestDispatcher("image.jsp").forward(req,resp);
                break;
            default:
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
