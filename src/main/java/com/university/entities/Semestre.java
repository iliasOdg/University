package com.university.entities;
// Generated 18 juil. 2018 08:25:27 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Semestre generated by hbm2java
 */
@Entity
@Table(name="semestre"
    ,schema="public"
)
public class Semestre  implements java.io.Serializable {


     private int idsemestre;
     private String libellesemestre;
     private String usrcreate;
     private String userlastupdate;
     private String userdelete;
     private Set<Enseignantmatiereclasse> enseignantmatiereclasses = new HashSet<Enseignantmatiereclasse>(0);

    public Semestre() {
    }

	
    public Semestre(int idsemestre) {
        this.idsemestre = idsemestre;
    }
    public Semestre(int idsemestre, String libellesemestre, String usrcreate, String userlastupdate, String userdelete, Set<Enseignantmatiereclasse> enseignantmatiereclasses) {
       this.idsemestre = idsemestre;
       this.libellesemestre = libellesemestre;
       this.usrcreate = usrcreate;
       this.userlastupdate = userlastupdate;
       this.userdelete = userdelete;
       this.enseignantmatiereclasses = enseignantmatiereclasses;
    }
   
     @Id 

    
    @Column(name="idsemestre", unique=true, nullable=false)
    public int getIdsemestre() {
        return this.idsemestre;
    }
    
    public void setIdsemestre(int idsemestre) {
        this.idsemestre = idsemestre;
    }

    
    @Column(name="libellesemestre", length=20)
    public String getLibellesemestre() {
        return this.libellesemestre;
    }
    
    public void setLibellesemestre(String libellesemestre) {
        this.libellesemestre = libellesemestre;
    }

    
    @Column(name="usrcreate", length=50)
    public String getUsrcreate() {
        return this.usrcreate;
    }
    
    public void setUsrcreate(String usrcreate) {
        this.usrcreate = usrcreate;
    }

    
    @Column(name="userlastupdate", length=50)
    public String getUserlastupdate() {
        return this.userlastupdate;
    }
    
    public void setUserlastupdate(String userlastupdate) {
        this.userlastupdate = userlastupdate;
    }

    
    @Column(name="userdelete", length=50)
    public String getUserdelete() {
        return this.userdelete;
    }
    
    public void setUserdelete(String userdelete) {
        this.userdelete = userdelete;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="semestre")
    public Set<Enseignantmatiereclasse> getEnseignantmatiereclasses() {
        return this.enseignantmatiereclasses;
    }
    
    public void setEnseignantmatiereclasses(Set<Enseignantmatiereclasse> enseignantmatiereclasses) {
        this.enseignantmatiereclasses = enseignantmatiereclasses;
    }




}


