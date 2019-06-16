package vn.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class ConnectionUtils {
	public static Connection getMyConnection() throws SQLException {
		String hostName = "localhost";
		String dbName = "user";
		String userName = "root";
		String passWord = "Weak";
		//return getMyConnection(hostName,dbName,userName,password);
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection  conn = DriverManager.getConnection(connectionURL, userName, passWord);
		return conn;
		
	}
	
	public static void main(String args[]) {
		Connection conn = null;
		try {
			conn = getMyConnection();
			String sql = " Select *from news,categories";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
		
			//System.out.println("ID   CAREGORY_ID   NAME      DESCRIPTION        DETAIL      IMAGE    DATE       USER_ID");
			while(rs.next()) {
				int id = rs.getInt(1);
				int category_id = rs.getInt(2);
				String name = rs.getString("news.name");
				String description = rs.getString(4);
				String detail = rs.getString(5);
				String image = rs.getString(6);
				Date date = (Date) rs.getDate("date");
				int user_id = rs.getInt(7);
                System.out.println("id: " +id + "|"+ "category_id:" +category_id + "|" + "name: " +name + "|" + "description:" +description + "|" + "detail: " +detail + "|" + "image:" +image + "|" /*+ "date: " +date + "|"*/ + "user_id:" +user_id);
			
                String name1 = rs.getString("categories.name");
                System.out.println(name1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("connection sucessful" +conn);
	}
}
