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

        if (username.equals("admin") && password.equals("admin")) {
            // Set session attribute and redirect to home page
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", username);
            response.sendRedirect(request.getContextPath() + "/WEB-INF/jsp/home.jsp");
        } else {
            // Set error message attribute and forward to login page
            request.setAttribute("errorMessage", "Invalid username or password.");
            request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp").forward(request, response);
        }
    }
}





