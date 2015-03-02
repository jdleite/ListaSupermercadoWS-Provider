package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemDAO;
import br.com.fiap.to.ItemTO;

public class ItemDAOImpl extends DAOImpl<ItemTO,Integer> 
									implements ItemDAO{

	public ItemDAOImpl(EntityManager em) {
		super(em);
	}

}
