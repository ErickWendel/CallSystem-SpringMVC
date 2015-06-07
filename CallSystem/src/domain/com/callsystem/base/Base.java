package com.callsystem.base;

import java.util.List;

public interface Base<T>{
	List<T> listar();
	void cadastrar(T item);
	void deletar(T item);
	void atualizar(T item);
	T pesquisarPorId(int id);
	
}
