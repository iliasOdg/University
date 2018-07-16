/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ilias
 */
@Entity
@Table(name = "anneeuniversitaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anneeuniversitaire.findAll", query = "SELECT a FROM Anneeuniversitaire a")
    , @NamedQuery(name = "Anneeuniversitaire.findByIdanneeuniversitaire", query = "SELECT a FROM Anneeuniversitaire a WHERE a.idanneeuniversitaire = :idanneeuniversitaire")
    , @NamedQuery(name = "Anneeuniversitaire.findByAnneeuniversitaire", query = "SELECT a FROM Anneeuniversitaire a WHERE a.anneeuniversitaire = :anneeuniversitaire")
    , @NamedQuery(name = "Anneeuniversitaire.findByEtat", query = "SELECT a FROM Anneeuniversitaire a WHERE a.etat = :etat")
    , @NamedQuery(name = "Anneeuniversitaire.findByUsercreate", query = "SELECT a FROM Anneeuniversitaire a WHERE a.usercreate = :usercreate")
    , @NamedQuery(name = "Anneeuniversitaire.findByUserlastupdate", query = "SELECT a FROM Anneeuniversitaire a WHERE a.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Anneeuniversitaire.findByUserdelete", query = "SELECT a FROM Anneeuniversitaire a WHERE a.userdelete = :userdelete")})
public class Anneeuniversitaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idanneeuniversitaire")
    private Integer idanneeuniversitaire;
    @Size(max = 20)
    @Column(name = "anneeuniversitaire")
    private String anneeuniversitaire;
    @Size(max = 20)
    @Column(name = "etat")
    private String etat;
    @Size(max = 50)
    @Column(name = "usercreate")
    private String usercreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;

    public Anneeuniversitaire() {
    }

    public Anneeuniversitaire(Integer idanneeuniversitaire) {
        this.idanneeuniversitaire = idanneeuniversitaire;
    }

    public Integer getIdanneeuniversitaire() {
        return idanneeuniversitaire;
    }

    public void setIdanneeuniversitaire(Integer idanneeuniversitaire) {
        this.idanneeuniversitaire = idanneeuniversitaire;
    }

    public String getAnneeuniversitaire() {
        return anneeuniversitaire;
    }

    public void setAnneeuniversitaire(String anneeuniversitaire) {
        this.anneeuniversitaire = anneeuniversitaire;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getUsercreate() {
        return usercreate;
    }

    public void setUsercreate(String usercreate) {
        this.usercreate = usercreate;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanneeuniversitaire != null ? idanneeuniversitaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anneeuniversitaire)) {
            return false;
        }
        Anneeuniversitaire other = (Anneeuniversitaire) object;
        if ((this.idanneeuniversitaire == null && other.idanneeuniversitaire != null) || (this.idanneeuniversitaire != null && !this.idanneeuniversitaire.equals(other.idanneeuniversitaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Anneeuniversitaire[ idanneeuniversitaire=" + idanneeuniversitaire + " ]";
    }
    
}
