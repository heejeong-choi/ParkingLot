package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDAO {
	
	static DBHandler db = new DBHandler();
	
	public int checkAdminPassword(AdminDTO dto) throws SQLException {
	
		Connection c = db.connect(); 
		Statement stat = c.createStatement();
		
		try 
		{
			 PreparedStatement preparedStatement = c.prepareStatement(
				"select password from admin where id = ? ");
		
			preparedStatement.setString(1,dto.getId());
		
			ResultSet rs = preparedStatement.executeQuery(); 
			
			
			
			if(rs.next()) 
			{
				if(dto.getPassword().equals(rs.getString(1))== true) 
				{
					return 0; //로그인 성공
				}
				else
					return -1; //비밀번호
			} 
			
			 return -2; //아이디가 없음
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
			stat.close();
			db.disconnect();
		}
		return -3; //데이터베이스 오류
	}
}