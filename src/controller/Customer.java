package controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

import model.CustomerDAO;
import model.CustomerDTO;

public class Customer {

    static CustomerDAO dao = new CustomerDAO();
    static CustomerDTO dto = new CustomerDTO();

    public static int newCustomer(HashMap<String, String> userData, String serviceDate) throws SQLException, ClassNotFoundException {

        dto.setName(userData.get("name"));
        dto.setPhone(userData.get("phone"));
        dto.setCarNumber(userData.get("car_number"));
        dto.setServiceEnd(userData.get("service_end"));

        System.out.println("Result: " + dao.newCustomer(dto));
        if(dao.newCustomer(dto) == 0) 
        {
        	return 0;
        }
        	return -1;
    }
 
    
    public static int checkCustomer(String car_number) throws SQLException {
    	
    	dto.setCarNumber(car_number);
    	
    	if(dao.checkCustomer(dto) > 0 ) {
    		return 0;
    	};
    	
    	return -1;
    }
    public static int checkValid(String car_number) throws SQLException, ClassNotFoundException {
    	
    	dto.setCarNumber(car_number);
    	
    	if(dao.checkValid(dto) == 0) {
    	} else {
    		return -1;
    	}
    		return 0;
    }
}