package com.deloitte.cui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.entities.User;

public class UserDao implements Dao<User> {

	@Override
	public User get(long id) {
		
			return null;
		}

		@Override
		public List<User> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void save(User user) {
			Connection connection = null;
			PreparedStatement ps = null;
			
			try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				
				
				connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "sharanya1", "sharanya");
			
			
				ps =connection.prepareStatement("delete from users where id = 1");
			
				//ps.setString(2, user.getLastName());
				
				ps.executeUpdate();
				
				ps.close();
				
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				try {
					
					if(ps!=null && !ps.isClosed()) {
					
						ps.close();
						}
					if(connection!=null && !connection.isClosed()) {
						
						connection.close();
						}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

		@Override
		public void update(User t, String[] params) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(User t) {
			// TODO Auto-generated method stub
			
		}
		
	}

