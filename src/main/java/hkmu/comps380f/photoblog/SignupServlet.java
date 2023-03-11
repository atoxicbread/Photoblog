package hkmu.comps380f.photoblog;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SignupServlet", value = "/signup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/signup.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        if (isValidUser(username, password, email)) {
            // Save user to the database
            response.sendRedirect("success.jsp");
        } else {
            request.setAttribute("error", "Invalid username or password or email");
            request.getRequestDispatcher("/WEB-INF/jsp/signup.jsp").forward(request, response);
        }
    }

    private boolean isValidUser(String username, String password, String email) {
        // Check if user already exists in the database
        // Return true if valid user, false otherwise

        return false;
    }
}
