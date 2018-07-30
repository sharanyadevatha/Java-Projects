package com.deloitte.cui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.entities.User;

public class UserDao implements Dao<User> {
	Connection connection = null;
	PreparedStatement ps = null;
	
	static {
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User get(long id) {
		
			return null;
		}

		@Override
		public List<User> getAll() {
			ResultSet rs = null;
			User row;
			ArrayList<User> user = new ArrayList<User>();
			int id;
			String firstName;
			String lastName;
			String userName;
			String status;
			String password;
			try {
				getConnection();
				
				ps =connection.prepareStatement("SELECT * FROM USERS");
				
				rs= ps.executeQuery();
				id = rs.getInt(1);
				firstName = rs.getString(2);
				lastName = rs.getString(3);
				userName = rs.getString(4);
				password = rs.getString(5);
				status = rs.getString(6);
				row = new User(id, firstName, lastName, userName, password, status);
				user.add(row);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			
			return null;
		}
		
		private void getConnection() throws SQLException
		{
			
				connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "sharanya1", "sharanya");
			
		}
		
		private void releaseResource()
		{
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

		@Override
		public void save(User user) {
			
			
			try {
				getConnection();
			
				ps =connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
			
				ps.setInt(1, user.getId());
				ps.setString(4, user.getUserName());
				ps.setString(2, user.getFirstName());
				ps.setString(3, user.getLastName());
				ps.setString(5, user.getPasswd());
				ps.setString(6, user.getStatus());
				
				
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				releaseResource();
								
			}
		}

		@Override
		public void update(User user, String[] params) {
			/*try {
			    getConnection();			
			
				ps = connection.prepareStatement("update users set id = ? where lastname = ?");
				
				ps.setInt(1, params[0]);
				ps.setString(2, user.getLastName());
				
				ps.executeUpdate();
		
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				releaseResource();	
				
			}*/
			
			
		}

		@Override
		public void delete(User user)  {
			
			
			try {
			    getConnection();			
			
				ps = connection.prepareStatement("DELETE FROM USERS WHERE ID = ?");
				
				ps.setInt(1, user.getId());
				
				ps.executeUpdate();
		
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				releaseResource();	
				
			}
				
			}
		}


			
			
		
		
	

