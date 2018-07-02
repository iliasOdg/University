/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ilias
 */
@Entity
@Table(name = "matiere")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matiere.findAll", query = "SELECT m FROM Matiere m")
    , @NamedQuery(name = "Matiere.findByIdmatiere", query = "SELECT m FROM Matiere m WHERE m.idmatiere = :idmatiere")
    , @NamedQuery(name = "Matiere.findByCodematiere", query = "SELECT m FROM Matiere m WHERE m.codematiere = :codematiere")
    , @NamedQuery(name = "Matiere.findByLibellelongmatiere", query = "SELECT m FROM Matiere m WHERE m.libellelongmatiere = :libellelongmatiere")
    , @NamedQuery(name = "Matiere.findByLibellecourtmatiere", query = "SELECT m FROM Matiere m WHERE m.libellecourtmatiere = :libellecourtmatiere")
    , @NamedQuery(name = "Matiere.findByEtat", query = "SELECT m FROM Matiere m WHERE m.etat = :etat")
    , @NamedQuery(name = "Matiere.findByUsrcreate", query = "SELECT m FROM Matiere m WHERE m.usrcreate = :usrcreate")
    , @NamedQuery(name = "Matiere.findByUserlastupdate", query = "SELECT m FROM Matiere m WHERE m.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Matiere.findByUserdelete", query = "SELECT m FROM Matiere m WHERE m.userdelete = :userdelete")})
public class Matiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmatiere")
    private Integer idmatiere;
    @Size(max = 20)
    @Column(name = "codematiere")
    private String codematiere;
    @Size(max = 100)
    @Column(name = "libellelongmatiere")
    private String libellelongmatiere;
    @Column(name = "libellecourtmatiere")
    private Integer libellecourtmatiere;
    @Size(max = 20)
    @Column(name = "etat")
    private String etat;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @OneToMany(mappedBy = "idmatiere")
    private List<Note> noteList;
    @OneToMany(mappedBy = "idmatiere")
    private List<Enseignantmatiereclasse> enseignantmatiereclasseList;

    public Matiere() {
    }

    public Matiere(Integer idmatiere) {
        this.idmatiere = idmatiere;
    }

    public Integer getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(Integer idmatiere) {
        this.idmatiere = idmatiere;
    }

    public String getCodematiere() {
        return codematiere;
    }

    public void setCodematiere(String codematiere) {
        this.codematiere = codematiere;
    }

    public String getLibellelongmatiere() {
        return libellelongmatiere;
    }

    public void setLibellelongmatiere(String libellelongmatiere) {
        this.libellelongmatiere = libellelongmatiere;
    }

    public Integer getLibellecourtmatiere() {
        return libellecourtmatiere;
    }

    public void setLibellecourtmatiere(Integer libellecourtmatiere) {
        this.libellecourtmatiere = libellecourtmatiere;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getUsrcreate() {
        return usrcreate;
    }

    public void setUsrcreate(String usrcreate) {
        this.usrcreate = usrcreate;
    }

    public String getUserlastupdate() {
        return userlastupdate;
    }

    public void setUserlastupdate(String userlastupdate) {
        this.userlastupdate = userlastupdate;
    }

    public String getUserdelete() {
        return userdelete;
    }

    public void setUserdelete(String userdelete) {
        this.userdelete = userdelete;
    }

    @XmlTransient
    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    @XmlTransient
    public List<Enseignantmatiereclasse> getEnseignantmatiereclasseList() {
        return enseignantmatiereclasseList;
    }

    public void setEnseignantmatiereclasseList(List<Enseignantmatiereclasse> enseignantmatiereclasseList) {
        this.enseignantmatiereclasseList = enseignantmatiereclasseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmatiere != null ? idmatiere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.idmatiere == null && other.idmatiere != null) || (this.idmatiere != null && !this.idmatiere.equals(other.idmatiere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Matiere[ idmatiere=" + idmatiere + " ]";
    }
    
}
