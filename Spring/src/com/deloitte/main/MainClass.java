package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.cui.Point;

public class MainClass {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Point point = (Point) context.getBean("pointBean");
		System.out.println(point);

	}
}
