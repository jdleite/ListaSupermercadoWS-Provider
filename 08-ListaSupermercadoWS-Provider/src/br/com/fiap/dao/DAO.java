package br.com.fiap.dao;

import java.util.List;

public interface DAO<T,K> {

	void cadastrar(T entity);
	
	List<T> listarTodos();
	
}
