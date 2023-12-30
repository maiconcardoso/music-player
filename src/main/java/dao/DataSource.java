package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	
	private String hostname;
	private String username;
	private String password;
	private String database;
	private Connection connection;
	
	public DataSource() {
		try {
			this.hostname = "localhost";
			this.username = "root";
			this.password = "mysql@123";
			this.database = "musicplayer";
			String url = "jdbc:mysql://"+ hostname +":3306/" + database +"?useTimezone=true&serverTimezone=UTC";
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			this.connection = DriverManager.getConnection(url, username, password);
			System.out.println("Datasource connected!");
		} catch (Exception e) {
			System.err.println("Mensagem de Erro: " + e.getMessage());
		}
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
}
