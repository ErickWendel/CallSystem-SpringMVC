package com.callsystem.dao;

import java.util.List;

import com.callsystem.base.Base;
import com.callsystem.dao.base.BaseDAO;
import com.callsystem.model.RamalVO;
import com.callsystem.model.UsuarioVO;

public class UsuarioDAO extends BaseDAO<UsuarioVO>{
	

	public List<UsuarioVO> listar() {
		return super.listar("from tb_usuario");
		
	}
	public UsuarioVO pesquisarPorId(int id){
		return super.pesquisarPorId("from tb_usuario where id =", id);
		
	}
	

}
