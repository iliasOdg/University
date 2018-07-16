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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "piecejustificative")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Piecejustificative.findAll", query = "SELECT p FROM Piecejustificative p")
    , @NamedQuery(name = "Piecejustificative.findByIdpiecejustificative", query = "SELECT p FROM Piecejustificative p WHERE p.idpiecejustificative = :idpiecejustificative")
    , @NamedQuery(name = "Piecejustificative.findByNompiecejustificative", query = "SELECT p FROM Piecejustificative p WHERE p.nompiecejustificative = :nompiecejustificative")
    , @NamedQuery(name = "Piecejustificative.findByPath", query = "SELECT p FROM Piecejustificative p WHERE p.path = :path")
    , @NamedQuery(name = "Piecejustificative.findByEtat", query = "SELECT p FROM Piecejustificative p WHERE p.etat = :etat")
    , @NamedQuery(name = "Piecejustificative.findByUsercreate", query = "SELECT p FROM Piecejustificative p WHERE p.usercreate = :usercreate")
    , @NamedQuery(name = "Piecejustificative.findByUserlastupdate", query = "SELECT p FROM Piecejustificative p WHERE p.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Piecejustificative.findByUserdelete", query = "SELECT p FROM Piecejustificative p WHERE p.userdelete = :userdelete")})
public class Piecejustificative implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpiecejustificative")
    private Integer idpiecejustificative;
    @Size(max = 100)
    @Column(name = "nompiecejustificative")
    private String nompiecejustificative;
    @Column(name = "path")
    private Integer path;
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
    @JoinColumn(name = "idinscription", referencedColumnName = "idinscription")
    @ManyToOne
    private Inscription idinscription;

    public Piecejustificative() {
    }

    public Piecejustificative(Integer idpiecejustificative) {
        this.idpiecejustificative = idpiecejustificative;
    }

    public Integer getIdpiecejustificative() {
        return idpiecejustificative;
    }

    public void setIdpiecejustificative(Integer idpiecejustificative) {
        this.idpiecejustificative = idpiecejustificative;
    }

    public String getNompiecejustificative() {
        return nompiecejustificative;
    }

    public void setNompiecejustificative(String nompiecejustificative) {
        this.nompiecejustificative = nompiecejustificative;
    }

    public Integer getPath() {
        return path;
    }

    public void setPath(Integer path) {
        this.path = path;
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

    public Inscription getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(Inscription idinscription) {
        this.idinscription = idinscription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpiecejustificative != null ? idpiecejustificative.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piecejustificative)) {
            return false;
        }
        Piecejustificative other = (Piecejustificative) object;
        if ((this.idpiecejustificative == null && other.idpiecejustificative != null) || (this.idpiecejustificative != null && !this.idpiecejustificative.equals(other.idpiecejustificative))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Piecejustificative[ idpiecejustificative=" + idpiecejustificative + " ]";
    }
    
}
