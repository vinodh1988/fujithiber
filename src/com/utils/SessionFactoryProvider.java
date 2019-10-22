package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    public static SessionFactory getSessionFactory() {
    	return
    			new Configuration().configure().buildSessionFactory();
    }
}
