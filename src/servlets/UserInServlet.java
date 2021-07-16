package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

import controller.Customer;
import controller.Pattern;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/customer")
public class UserInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HashMap<String, String> userData = new HashMap<String, String>();
		LocalDate currentDate = LocalDate.now();
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String car_number = request.getParameter("car_number");
	    String service_end = request.getParameter("service_end");
	    
	    
	    // null 일치 확인
	    if(name == null || name.length() == 0) {
	    	PrintWriter script = response.getWriter();
		    	script.println("<script>");
		    	script.println("alert('no blank')");
		    	script.println("history.back()");
		    	script.println("</script>");
		    	script.close();
	    }
	    if(phone == null || phone.length() == 0) {
		   	PrintWriter script = response.getWriter();
			   	script.println("<script>");
		    	script.println("alert('no blank')");
		    	script.println("history.back()");
		    	script.println("</script>");
		    	script.close();
	    }
		if(car_number == null || car_number.length() == 0) {
		   	PrintWriter script = response.getWriter();
			   	script.println("<script>");
		    	script.println("alert('no blank')");
		    	script.println("history.back()");
		    	script.println("</script>");
		    	script.close();
		}
		if(service_end == null || service_end.length() == 0) {
		  	PrintWriter script = response.getWriter();
			  	script.println("<script>");
		    	script.println("alert('no blank')");
		    	script.println("history.back()");
		    	script.println("</script>");
		    	script.close();
	    }
		
	    if(car_number.matches(Pattern.carNumPattern)) {
	    } else {
	    	PrintWriter script = response.getWriter();
		    	script.println("<script>");
		    	script.println("alert('carNumber is incorrect')");
		    	script.println("history.back()");
		    	script.println("</script>");
		    	script.close();
	    }
	    
	    userData.put("name", name);
	    userData.put("phone", phone);
	    userData.put("car_number", car_number);
	    
	    System.out.println("name: " + name + ", phone: " + phone + 
	            ", car_number: " + car_number + ", end: " + service_end);
	    
	    try 
	    {
	    	if(Customer.newCustomer(userData, service_end) == 0)
	    	{
	    		PrintWriter script = response.getWriter();
	    		script.println("<script>");
		    	script.println("alert('already exist car_number')");
		    	script.println("history.back()");
		    	script.println("</script>");
		    	script.close();
	    	}
	    	else 
	    	{
	    		PrintWriter script = response.getWriter();
	    		script.println("<script>");
		    	script.println("location.href = 'customer.jsp'");
		    	script.println("</script>");
		    	script.close();
	    	}
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    String txt = "success";
	    PrintWriter out = response.getWriter();
	    response.setCharacterEncoding("UTF-8");
	    out.print(txt);
	    out.flush();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");

		
		request.getRequestDispatcher("customer.jsp").forward(request, response);
		
		RequestDispatcher rd = request.getRequestDispatcher("/customer.jsp");
		rd.forward(request, response);
	}
}