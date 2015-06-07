package com.callsystem.business;

import java.util.List;

import com.callsystem.base.Base;
import com.callsystem.dao.AdministradorDAO;
 
import com.callsystem.model.AdministradorVO;
 

public class AdministradorBUS implements Base<AdministradorVO> {

	AdministradorDAO _dao = new AdministradorDAO();
	@Override
	public List<AdministradorVO> listar() {
		 return _dao.listar();
	}

	@Override
	public void cadastrar(AdministradorVO item) {
		  _dao.cadastrar(item);
		
	}

	@Override
	public void deletar(AdministradorVO item) {
		 _dao.deletar(item);
		
	}

	@Override
	public void atualizar(AdministradorVO item) {
		 _dao.deletar(item);
		
	}

	@Override
	public AdministradorVO pesquisarPorId(int id) {
		return  _dao.pesquisarPorId(id);
	}


	

}
