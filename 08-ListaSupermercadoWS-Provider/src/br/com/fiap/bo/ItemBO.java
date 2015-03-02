package br.com.fiap.bo;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemDAO;
import br.com.fiap.dao.impl.ItemDAOImpl;
import br.com.fiap.singleton.EMFactorySingleton;
import br.com.fiap.to.ItemTO;

public class ItemBO {

	private ItemDAO dao;
	
	public ItemBO(){
		EntityManager em = EMFactorySingleton
				.getInstance().createEntityManager();
		dao = new ItemDAOImpl(em);
	}
	
	public ItemTO cadastrar(ItemTO item){
		dao.cadastrar(item);
		return item;
	}
	
	public List<ItemTO> listar(){
		return dao.listarTodos();
	}
	
}




