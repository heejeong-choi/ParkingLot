package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import controller.Customer;
import controller.Parking;
import controller.Pattern;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/exit")
public class CarOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txt = "Bye Guest";
		Customer cs = new Customer();
		int is_registered = 0;
		
		request.setCharacterEncoding("utf-8");
		String car_number = request.getParameter("car_number");
		
		if(car_number == null || car_number.length() == 0) {
		  	PrintWriter script = response.getWriter();
		  	script.println("no null");
	    	script.close();
	    }
		if(car_number.matches(Pattern.carNumPattern)) {
	    } else {
	    	PrintWriter script = response.getWriter();
	    	script.println("car_number incorrect");
	    	script.close();
	    }
		
		try {
			if(cs.checkCustomer(car_number) == 0){
				if(cs.checkValid(car_number) == 0) {
					txt = "Bye User";
				} else {
					txt="Qualification expired.check please";
				}
				
				is_registered = 1;
			}
			Parking.checkOutCar(car_number, is_registered);
			
		} catch (SQLException e) {
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
		
		RequestDispatcher rd = request.getRequestDispatcher("/adminPage.jsp");
		RequestDispatcher rd1 = request.getRequestDispatcher("/calculateCharge.jsp");
		
		rd.forward(request, response);
		rd1.forward(request, response);
	}

}