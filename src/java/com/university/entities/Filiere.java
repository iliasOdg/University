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
@Table(name = "filiere")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filiere.findAll", query = "SELECT f FROM Filiere f")
    , @NamedQuery(name = "Filiere.findByIdfiliere", query = "SELECT f FROM Filiere f WHERE f.idfiliere = :idfiliere")
    , @NamedQuery(name = "Filiere.findByLibellelongfiliere", query = "SELECT f FROM Filiere f WHERE f.libellelongfiliere = :libellelongfiliere")
    , @NamedQuery(name = "Filiere.findByLibellecourtfiliere", query = "SELECT f FROM Filiere f WHERE f.libellecourtfiliere = :libellecourtfiliere")
    , @NamedQuery(name = "Filiere.findByUsrcreate", query = "SELECT f FROM Filiere f WHERE f.usrcreate = :usrcreate")
    , @NamedQuery(name = "Filiere.findByUserlastupdate", query = "SELECT f FROM Filiere f WHERE f.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Filiere.findByUserdelete", query = "SELECT f FROM Filiere f WHERE f.userdelete = :userdelete")})
public class Filiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfiliere")
    private Integer idfiliere;
    @Size(max = 50)
    @Column(name = "libellelongfiliere")
    private String libellelongfiliere;
    @Size(max = 10)
    @Column(name = "libellecourtfiliere")
    private String libellecourtfiliere;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @OneToMany(mappedBy = "idfiliere")
    private List<Classe> classeList;

    public Filiere() {
    }

    public Filiere(Integer idfiliere) {
        this.idfiliere = idfiliere;
    }

    public Integer getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(Integer idfiliere) {
        this.idfiliere = idfiliere;
    }

    public String getLibellelongfiliere() {
        return libellelongfiliere;
    }

    public void setLibellelongfiliere(String libellelongfiliere) {
        this.libellelongfiliere = libellelongfiliere;
    }

    public String getLibellecourtfiliere() {
        return libellecourtfiliere;
    }

    public void setLibellecourtfiliere(String libellecourtfiliere) {
        this.libellecourtfiliere = libellecourtfiliere;
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
    public List<Classe> getClasseList() {
        return classeList;
    }

    public void setClasseList(List<Classe> classeList) {
        this.classeList = classeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfiliere != null ? idfiliere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiere)) {
            return false;
        }
        Filiere other = (Filiere) object;
        if ((this.idfiliere == null && other.idfiliere != null) || (this.idfiliere != null && !this.idfiliere.equals(other.idfiliere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Filiere[ idfiliere=" + idfiliere + " ]";
    }
    
}
