package Controller;


import Business.User;
import DB.UserDB;

import javax.servlet.annotation.WebServlet;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/userAdmin"})
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String url = "/index.jsp";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "display_users";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {
            // get list of users
            ArrayList<User> users = null;
            try {
                users = UserDB.selectUsers();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("users", users);
        }
        else if (action.equals("display_user")) {
            String emailAddress = request.getParameter("email");
            User user = null;
            try {
                user = UserDB.selectUser(emailAddress);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            session.setAttribute("user", user);
            url = "/user.jsp";
        }
        else if (action.equals("update_user")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            // get and update user
            User user = (User) session.getAttribute("user");
            user.setFirstName(firstName);
            user.setLastName(lastName);
            try {
                UserDB.update(user);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // get and set updated users
            ArrayList<User> users = null;
            try {
                users = UserDB.selectUsers();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("users", users);
        }
        else if (action.equals("delete_user")) {
            // get the user
            String email = request.getParameter("email");
            User user = null;
            try {
                user = UserDB.selectUser(email);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // delte the user
            try {
                UserDB.delete(user);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // get and set updated users
            ArrayList<User> users = null;
            try {
                users = UserDB.selectUsers();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("users", users);
        }

        getServletContext()
                .getRequestDispatcher("/ch12_ex2_admin"+url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}