package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Date;

public class CustomerDAO {

    static DBHandler db = new DBHandler();

    public int newCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {
        Connection c = db.connect();

        try {
        PreparedStatement preparedStatement = c.prepareStatement(
                "insert into customer(name,phone,car_number,service_end) values (?,?,?,?)");

        preparedStatement.setString(1, dto.getName());
        preparedStatement.setString(2, dto.getPhone());
        preparedStatement.setString(3, dto.getCarNumber());
        preparedStatement.setString(4, dto.getServiceEnd());
        
    	int rs = preparedStatement.executeUpdate();
		
		if(rs != 0) {
				return 0;
		}
		preparedStatement.close();
		
		} catch (SQLIntegrityConstraintViolationException e){
			e.printStackTrace();
			return -1;	
		} catch (Exception e) {
			e.printStackTrace();

			db.disconnect();
        }
		return -2;	
    }

	public int checkCustomer(CustomerDTO dto) throws SQLException { 
		
		Connection c = db.connect();
		Statement stat = c.createStatement();
		
		PreparedStatement preparedStatement = c.prepareStatement(
				"select cid from customer where car_number = ?");
		
		preparedStatement.setString(1,  dto.getCarNumber());
		
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()) {
			return rs.getInt("cid");
		}
		stat.close();
		
		db.disconnect();
		
		return 0;
	}
	
	public int checkValid(CustomerDTO dto) throws ClassNotFoundException, SQLException{
		Connection c = db.connect();
		Statement stat = c.createStatement();
		
		PreparedStatement preparedStatement = c.prepareStatement(
				"select service_end from customer where car_number = ? ");

		preparedStatement.setString(1, dto.getCarNumber());
		
		ResultSet rs = preparedStatement.executeQuery();
			
		if(rs.next()) {
			
			Date date = rs.getDate(1);
			long validDate = date.getTime();
			long today = System.currentTimeMillis();
			
			if(validDate > today) {
				
			} else {
				
				return -1; // 등록기간 만료
			}
			
			stat.close();
			db.disconnect();
		}
		
		return 0; // 등록기간 유효
		
	}
	public static void main(String[] args) throws SQLException {
		Connection c = db.connect();
		ResultSet rs = null;
		Statement stmt = null;
		
		String SQL = "select * from customer";
		stmt = c.createStatement();
		rs = stmt.executeQuery(SQL);
		
		while(rs.next()) {
			String name = rs.getString("name");
			
			System.out.println(name);
		}
	}
}