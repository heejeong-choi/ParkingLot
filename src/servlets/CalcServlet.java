package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.sql.SQLException;
import java.text.ParseException;

import controller.Customer;
import controller.Parking;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("static-access")
@WebServlet("/charge")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txt = "";
		Customer cs = new Customer();
		Parking pk = new Parking();
		
		int is_registered = 0;
		
		request.setCharacterEncoding("utf-8");
		String car_number = request.getParameter("car_number");
		
		try {
			if(cs.checkCustomer(car_number) == 0){
				if(cs.checkValid(car_number) == 0) {
					is_registered = 1;
					txt = "Valid User";
				} else {
					txt="Qualification expired";
				}					
				
			} else {
				
			int charge = pk.calculateCharge(car_number, is_registered);
			txt = "guest " + charge +" won";
			}
		} catch (SQLException e) {
			txt = "error!";
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(ParseException e) {
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
		
		RequestDispatcher rd = request.getRequestDispatcher("/fee.jsp");
		rd.forward(request, response);
	}

}