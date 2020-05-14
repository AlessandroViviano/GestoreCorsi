package it.polito.tdp.corsi.model;

import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	public List<Corso> getCorsiByPeriodo(Integer pd){
		CorsoDAO dao = new CorsoDAO();
		return dao.getCorsiByPeriodo(pd);
	}

}
