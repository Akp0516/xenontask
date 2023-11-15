import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("root");
        String password = request.getParameter("Anil@1234");

        boolean isValidUser = validateUser(username, password);

        if (isValidUser) {

            response.sendRedirect("index.html");
        } else {

            response.sendRedirect("login.html?error=invalid");
        }
    }

    private boolean validateUser(String username, String password) {

        return true;
    }
}
