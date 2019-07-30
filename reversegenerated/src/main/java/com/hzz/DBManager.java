package com.hzz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * 
 *
 */
public class DBManager {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		/**
		 * 输入连接串 ， 用户名， 密码
		 */
		try {
			conn = DriverManager.getConnection("", "", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	public static void close(Connection conn, Statement pre, ResultSet set) {

		try {
			if (conn != null)
				conn.close();
			if (pre != null)
				pre.close();
			if (set != null)
				set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
