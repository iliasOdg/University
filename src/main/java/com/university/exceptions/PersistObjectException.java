/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.exceptions;

/**
 *
 * @author Ilias
 */
public class PersistObjectException extends Exception {

    /**
     * Creates a new instance of <code>PersistObjectException</code> without
     * detail message.
     */
    private Object cause;
    
    public PersistObjectException(Object cause, String operation) {
        super("Une erreur est survenue lors de l'enregistrement "+operation+"! \n Cause : "+cause);
    }
    
    public Object cause(){
        return cause;
    }
    /**
     * Constructs an instance of <code>PersistObjectException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PersistObjectException(String msg) {
        super(msg);
    }
}
