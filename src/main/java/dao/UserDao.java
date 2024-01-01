package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import model.User;

public class UserDao implements GenericDao {
	
	private DataSource datasource;
	
	public UserDao (DataSource datasource) {
		this.datasource = datasource;
	}
	
	// Abrir conexão com banco de dados
	Connection connection = null;

	@Override
	public void create(Object o) {
			
	}

	@Override
	public Object read(Object o) {
		
		try {
			if (o instanceof User) {
				connection = datasource.getConnection();
				User user = (User) o;
				String createSQL = "SELECT * FROM users WHERE email = ? AND password_ = ?";
				PreparedStatement pst = connection.prepareStatement(createSQL);
				pst.setString(1, user.getEmail());
				pst.setString(2, user.getPassword());
				pst.executeQuery();
			}
			connection.close();
			return  o;
			
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
		
	}
	
	@Override
	public List<Object> readAll(Object o) {
		return null;
	}

	@Override
	public void update(Object o) {
		
		
	}

	@Override
	public void delete(Object o) {
		
		
	}

}
