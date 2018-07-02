/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.university.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "moyenne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moyenne.findAll", query = "SELECT m FROM Moyenne m")
    , @NamedQuery(name = "Moyenne.findByIdmoyenne", query = "SELECT m FROM Moyenne m WHERE m.idmoyenne = :idmoyenne")
    , @NamedQuery(name = "Moyenne.findByMoyenne", query = "SELECT m FROM Moyenne m WHERE m.moyenne = :moyenne")
    , @NamedQuery(name = "Moyenne.findByFgsession", query = "SELECT m FROM Moyenne m WHERE m.fgsession = :fgsession")
    , @NamedQuery(name = "Moyenne.findBySemestre", query = "SELECT m FROM Moyenne m WHERE m.semestre = :semestre")
    , @NamedQuery(name = "Moyenne.findByUsrcreate", query = "SELECT m FROM Moyenne m WHERE m.usrcreate = :usrcreate")
    , @NamedQuery(name = "Moyenne.findByUserlastupdate", query = "SELECT m FROM Moyenne m WHERE m.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Moyenne.findByUserdelete", query = "SELECT m FROM Moyenne m WHERE m.userdelete = :userdelete")})
public class Moyenne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmoyenne")
    private Integer idmoyenne;
    @Column(name = "moyenne")
    private BigInteger moyenne;
    @Column(name = "fgsession")
    private Boolean fgsession;
    @Column(name = "semestre")
    private Integer semestre;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @JoinColumn(name = "idinscription", referencedColumnName = "idinscription")
    @ManyToOne
    private Inscription idinscription;

    public Moyenne() {
    }

    public Moyenne(Integer idmoyenne) {
        this.idmoyenne = idmoyenne;
    }

    public Integer getIdmoyenne() {
        return idmoyenne;
    }

    public void setIdmoyenne(Integer idmoyenne) {
        this.idmoyenne = idmoyenne;
    }

    public BigInteger getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(BigInteger moyenne) {
        this.moyenne = moyenne;
    }

    public Boolean getFgsession() {
        return fgsession;
    }

    public void setFgsession(Boolean fgsession) {
        this.fgsession = fgsession;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
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

    public Inscription getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(Inscription idinscription) {
        this.idinscription = idinscription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmoyenne != null ? idmoyenne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moyenne)) {
            return false;
        }
        Moyenne other = (Moyenne) object;
        if ((this.idmoyenne == null && other.idmoyenne != null) || (this.idmoyenne != null && !this.idmoyenne.equals(other.idmoyenne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Moyenne[ idmoyenne=" + idmoyenne + " ]";
    }
    
}
