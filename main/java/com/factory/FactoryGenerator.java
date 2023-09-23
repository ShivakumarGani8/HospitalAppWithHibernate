package com.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryGenerator {
	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		if (factory == null) {
			try {
				Configuration config = new Configuration();
				config.configure("hibernate.cfg.xml");
				factory = config.buildSessionFactory();
			} catch (Exception e) {
				System.out.println("DB Connection Error!");
			}
		}
		return factory;
	}
}
