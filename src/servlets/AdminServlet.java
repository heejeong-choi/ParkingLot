package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import controller.Admin;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AdminDTO;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("adminID");
		String password = request.getParameter("adminPassword");
		
			int result;
		
			try {
				result = Admin.checkAdminPassword(id,password);
				
				if (result == 0) {
					PrintWriter script = response.getWriter();
						script.println("<script>");
						script.println("location.href = 'admin.jsp'");
						script.println("</script>");
						script.close();
				}
				else if (result == -1) {
					PrintWriter script = response.getWriter();
						script.println("<script>");
						script.println("alert('password incorrect')");
						script.println("history.back()");
						script.println("</script>");
						script.close();
				}	
				else if (result == -2) {
					PrintWriter script = response.getWriter();
						script.println("<script>");
						script.println("alert('id incorrect')");
						script.println("history.back()");
						script.println("</script>");
						script.close();
				}
				else if (result == -3) {
					PrintWriter script = response.getWriter();
						script.println("<script>");
						script.println("location.href = 'errorPage.jsp'");
						script.println("</script>");
						script.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		RequestDispatcher rd = request.getRequestDispatcher("/admin.jsp");
		rd.forward(request, response);
	}

}