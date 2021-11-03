package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/ch12_ex1_sqlGateway"})
public class ch12ex1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url="/ch12_ex1_sqlGate/index.jsp";
        RequestDispatcher rd=req.getRequestDispatcher(url);
        rd.forward(req,resp);
    }
}
