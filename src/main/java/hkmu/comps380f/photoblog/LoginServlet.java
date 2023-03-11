package hkmu.comps380f.photoblog;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (isValidUser(username, password)) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect("success.jsp");
        } else {
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp")
                    .forward(request, response);
        }
    }

    private boolean isValidUser(String username, String password) {
        // Check if user exists in the database and password matches
        // Return true if valid user, false otherwise
        if (username == null || username.isEmpty()
                || password == null || password.isEmpty()) {
            return false;
        }
        // User is valid if all checks pass
        return true;

    }


}
