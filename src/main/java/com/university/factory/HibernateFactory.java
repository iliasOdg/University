/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.university.factory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ilias
 */
public class HibernateFactory {
    private static SessionFactory sessionFactory;
    private static Session session;
    
    static{
        
        try {
            Configuration config = new Configuration();
            sessionFactory = config.configure().buildSessionFactory();
            session = sessionFactory.openSession();
            System.out.println("Session créee..");
        } catch (HibernateException e) {
            System.out.println("Erreur lors du chargement...\n"+e.getMessage());
        }
        
    }
    
    public static Session getSession(){
        return session;
    }
    
    public static void closeSessionFactory(){
        sessionFactory.close();
        System.out.println("session fermée!!");
    }
}
