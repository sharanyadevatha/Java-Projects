package com.deloitte.dao;
import java.util.List;
public interface ProductDao<T> {

	String get(int id);

	List<T> getAll();

	void save(T t);

	void update(T t, String[] params);

	void delete(T t);

}
