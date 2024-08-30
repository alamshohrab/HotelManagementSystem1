import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	protected void dopost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if("admin".contentEquals(username)&&"password123".contentEquals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
	}
}