/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import com.university.dao.GenericDAO;
import com.university.entities.Classe;
import com.university.entities.Enseignant;
import com.university.entities.Filiere;
import com.university.entities.Matiere;
import com.university.exceptions.PersistObjectException;
import java.math.BigDecimal;
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
        
        Enseignant e1 = new Enseignant(0, "YAYA", "TRAORE", "r1", "Mr", "Doctorat info", "actif", "yaytra@gmail.com", "yaytra@gmail.com", "yaytra@gmail.com", null);
        Matiere m = new Matiere(1, "POO", "PROG ORIENTE OBJE", Integer.MIN_VALUE, "actif", null, null, null, null, null);
        Matiere m2 = new Matiere(2, "Anglais", "Anglais professionnel", 2  , "0", null, null, null, null, null);
        //Classe c1 = new Classe(0, new Filiere(0, "MIAGE", "MIAGE", null, null, null, null), "MIAGE",
                //BigDecimal.valueOf(2500000), null, null, null, null, null);
        
        Classe c2 = new Classe(1);
        c2.setLibelleclasse("M1 MIAGE");
        c2.setScolarite(BigDecimal.ONE);
        //GenericDAO<Matiere> dAO = new GenericDAO<>();
        GenericDAO<Classe> dAo = new GenericDAO<>();
        //dAO.persistObject(m);
        //dAo.persistObject(c2);
        dAo.removeObject(c2);
        
    }
    
}
