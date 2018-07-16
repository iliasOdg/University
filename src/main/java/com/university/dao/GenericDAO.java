/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.dao;

import com.university.exceptions.PersistObjectException;
import com.university.factory.HibernateFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ilias
 * @param <T>
 */
public class GenericDAO<T> {
    
    private Session session;
    private Transaction tx = null;
    
    public GenericDAO(){
        
    }
    
    public void persistObject(T entity)throws PersistObjectException{
        session = HibernateFactory.getSession();
        try {
            tx = session.beginTransaction();
            session.persist(entity);
            session.flush();
            System.out.println(entity.getClass() + " Enregistrée..");
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null){
                tx.rollback();
            } throw new PersistObjectException(e.getMessage(), " l'enregistrement");
        }finally{
            session.close();
        }
        HibernateFactory.closeSessionFactory();
    }
    
    public void updateObject(T entity)throws PersistObjectException{
        session = HibernateFactory.getSession();
        
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
            throw new PersistObjectException(e.getMessage(), "Mise à jour..");
        }finally{
            HibernateFactory.closeSessionFactory();
        }
    }
    
    public void removeObject(T entity)throws PersistObjectException{
        session = HibernateFactory.getSession();
        
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
            throw new PersistObjectException(e.getMessage(), "Suppression..");
        }finally{
            HibernateFactory.closeSessionFactory();
        }
    }
    
    public T findObjectByPrimaryKey(T entity, Object pk){
        session = HibernateFactory.getSession();
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
            HibernateFactory.closeSessionFactory();
        }
        
        return result;
    }
    
    
}
