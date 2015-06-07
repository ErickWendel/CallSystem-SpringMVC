package com.callsystem.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionFactory {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	//Session sessao = null;

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			return sf;
		} catch (Throwable e) {
			System.out
					.println("Cria��o inicial do objeto SessionFactory falhou. Erro: "
							+ e.getMessage());
			throw new ExceptionInInitializerError(e.getMessage());
		}
	}

	public static Session getSessionFactory() {
		return sessionFactory.openSession();
	}

	// Este main eu coloquei s� para testar minha classe, desta forma tenho
	// dom�nio do que estou fazendo de correto!
	public static void main(String[] a) {

		System.out.println(getSessionFactory());
		//Session sessao = ConnectionFactory.getSessionFactory().openSession();
		System.out.println("Conectado no Banco!");
	}

}
