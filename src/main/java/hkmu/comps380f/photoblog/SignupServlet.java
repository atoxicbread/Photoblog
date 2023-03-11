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
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");


        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("phone", phone);
        request.setAttribute("email", email);

        // Forward to the signup result page
        request.getRequestDispatcher("/WEB-INF/jsp/signupResult.jsp")
                .forward(request, response);
    }
}
