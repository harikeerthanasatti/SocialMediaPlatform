package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import View.Alert;

public class Database {
	
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String dbUname= "C##smplatform";
	private String dbPwd = "smplatform";
	private Statement statement;
	
	public Database() {
		try {
			Connection connection = DriverManager.getConnection(dbUrl,dbUname,dbPwd);
			System.out.println("Connection successful!");
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
									ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			new Alert(e.getMessage(), null);
		}
	}
	
	public Statement getStatement() {
		return statement;
	}

}
