package controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import model.AdminDAO;
import model.AdminDTO;

public class Admin {
	
    static AdminDAO dao = new AdminDAO();
	static AdminDTO dto = new AdminDTO();
	
	public static int checkAdminPassword(String id, String password) throws SQLException {

		dto.setId(id);
		dto.setPassword(password);
		int result = dao.checkAdminPassword(dto);
		
		System.out.println("RESLUT: " + result);
		if (result == 0) {
		}
		else if (result == -1) {
			return -1;
		}
		else if (result == -2) {
			return -2;
		}
		else if (result == -3) {
			return -3;
		}
			return result;
	}
	
	public class SecurityUtil{
		public String encryptSHA256(String str) {
			String sha = "";
			try {
				MessageDigest sh = MessageDigest.getInstance("SHA-256");
				sh.update(str.getBytes());
				byte byteData[] = sh.digest();
				StringBuffer sb = new StringBuffer();
				for(int i = 0; i < byteData.length ; i++) {
					sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
				}
				sha = sb.toString();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
				System.out.println("Encrypt Error - NoSuchAlgorithmException");
				sha = null;
			}
			return sha;
		}
	}
}