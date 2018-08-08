package com.deloitte.spring.hibernate.SpringMvcHibernate.service;

import java.util.List;

import com.deloitte.spring.hibernate.SpringMvcHibernate.model.Person;


public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public com.deloitte.spring.hibernate.SpringMvcHibernate.model.Person getPersonById(int id);
	public void removePerson(int id);
	
}
