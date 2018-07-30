package com.deloitte.com;

import com.deloitte.cui.UserDao;
import com.deloitte.entities.User;

public class MainClass {
	

		public static void main(String[] args) {
			User user = new User(1, "SharanyaD", "Sharanya", "D", "team", "E");
			
			UserDao udao = new UserDao();
			//udao.save(user);
			udao.delete(user);
			
			String arr[] = {"2"};
			udao.update(user,arr );
		}

	}


