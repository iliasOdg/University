/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.university.dao.GenericDAO;
import com.university.entities.Enseignant;
import com.university.entities.Matiere;
import com.university.exceptions.PersistObjectException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ilias
 */
public class JUnitTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matiere m = new Matiere(1, "POO", "PROG ORIENTE OBJE", Integer.MIN_VALUE, "actif", null, null, null, null, null);
        ArrayList<Matiere> liste = new ArrayList<>();
        Enseignant e = new Enseignant(1, "TRAORE", "YAYA", "", "Mr", "Doctorat", "", "", "", "", null);
        
        GenericDAO<Enseignant> dAO = new GenericDAO<>();
        try {
            dAO.persistObject(e);
        } catch (PersistObjectException ex) {
            Logger.getLogger(JUnitTests.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
