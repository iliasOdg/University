/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.dao;

import com.university.factory.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ilias
 * @param <T>
 */
public class GenericDAO<T> {
    
    private Session session;
    private SessionFactory sessionFactory;
    private Transaction tx = null;
    
    public GenericDAO(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    public void persistObject(T entity){
        session = sessionFactory.openSession(); 
        try {
            tx = session.beginTransaction();
            session.persist(entity);
            session.flush();
            System.out.println(entity.getClass() + " Enregistrée..");
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null){
                tx.rollback();
            } //throw new PersistObjectException(e.getMessage(), " l'enregistrement");
        }finally{
            if (tx != null) {
                session.close();
            }
        }
        
    }
    
    public void updateObject(T entity){
        session = sessionFactory.openSession();
        
        try {
            tx = session.beginTransaction();
            session.update(entity);
            session.flush();
            System.out.println("Mise à jour effectuée..");
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            //throw new PersistObjectException(e.getMessage(), "Mise à jour..");
        }finally{
            if (tx != null) {
                session.close();
            }
            
        }
    }
    
    public void removeObject(T entity){
        session = sessionFactory.openSession();
        try {
            tx = session.beginTransaction();
            session.remove(entity);
            session.flush();
            System.out.println("Suppression effectuée..");
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            //throw new PersistObjectException(e.getMessage(), "Suppression..");
        }finally{
            if (tx != null) {
                session.close();
            }
        }
    }
    
    public T findObjectByPrimaryKey(T entity, Object pk){
        session = sessionFactory.openSession();
        T result;
        try {
            tx = session.beginTransaction();
            result = (T) session.find(entity.getClass(), pk);
            session.flush();
            System.out.println("Suppression effectuée..");
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        }finally{
            if (tx != null) {
                session.close();
                
            }
        }
        
        return result;
    }
    
    
}
