package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.SQLException;
import java.time.LocalDateTime;

import controller.Customer;
import controller.Parking;
import controller.Pattern;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/in")
public class CarInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime inTime = LocalDateTime.now();
		String txt = "Welcome guest";
		Customer cs = new Customer();
		int is_registered = 0;
		
		request.setCharacterEncoding("utf-8");
		String car_number = request.getParameter("car_number");
		
		if(car_number == null || car_number.length() == 0) {
		  	PrintWriter script = response.getWriter();
		  	script.println("<script>");
		  	script.println("alert('you should fill in')");
		  	script.println("history.back()");
		  	script.println("</script>");
	    	script.close();
	    }
		if(car_number.matches(Pattern.carNumPattern)) {
			PrintWriter script = response.getWriter();
		  	script.println("<script>");
		  	script.println("location.href = 'index.jsp'");
		  	script.println("</script>");
	    	script.close();
	    } else {
	    	PrintWriter script = response.getWriter();
	    	script.println("<script>");
		  	script.println("alert('car number is incorrect!')");
		  	script.println("history.back()");
		  	script.println("</script>");
	    	script.close();
	    }
		
		try {
			if(cs.checkCustomer(car_number) == 0){
				
				txt = "Welcome User";
				is_registered = 1;
			}
			Parking.checkInCar(car_number, inTime, is_registered);
			
		} catch (SQLException  e) {
			txt = "error!";
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("utf-8");
		out.print(txt);
		out.flush();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		request.getRequestDispatcher("parking_in.jsp").forward(request, response);
		
		RequestDispatcher rd = request.getRequestDispatcher("/in");
		rd.forward(request, response);
	}
}