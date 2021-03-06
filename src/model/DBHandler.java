package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {

    static String server = "127.0.0.1:3306"; // MySQL 서버 주소
    static String database = "parkinglot"; // MySQL DATABASE 이름
    static String userName = "root"; //  MySQL 서버 아이디
    static String password = "***********"; // MySQL 서버 비밀번호
    Connection con = null;

    public DBHandler() {
        // 1.드라이버 로딩
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // DB 연결
    public Connection connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?serverTimezone=UTC", userName, password);

        } catch(SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

        return con;
    }

    // DB 연결 해제
    public int disconnect() {
        try {
            if(con != null) {
                con.close();
            }
        } catch (SQLException e) {
            return -1;
        }

        return 0;
    }

}
