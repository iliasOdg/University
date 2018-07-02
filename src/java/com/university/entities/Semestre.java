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
@Table(name = "semestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semestre.findAll", query = "SELECT s FROM Semestre s")
    , @NamedQuery(name = "Semestre.findByIdsemestre", query = "SELECT s FROM Semestre s WHERE s.idsemestre = :idsemestre")
    , @NamedQuery(name = "Semestre.findByLibellesemestre", query = "SELECT s FROM Semestre s WHERE s.libellesemestre = :libellesemestre")
    , @NamedQuery(name = "Semestre.findByUsrcreate", query = "SELECT s FROM Semestre s WHERE s.usrcreate = :usrcreate")
    , @NamedQuery(name = "Semestre.findByUserlastupdate", query = "SELECT s FROM Semestre s WHERE s.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Semestre.findByUserdelete", query = "SELECT s FROM Semestre s WHERE s.userdelete = :userdelete")})
public class Semestre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsemestre")
    private Integer idsemestre;
    @Size(max = 20)
    @Column(name = "libellesemestre")
    private String libellesemestre;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @OneToMany(mappedBy = "idsemestre")
    private List<Enseignantmatiereclasse> enseignantmatiereclasseList;

    public Semestre() {
    }

    public Semestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    public Integer getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    public String getLibellesemestre() {
        return libellesemestre;
    }

    public void setLibellesemestre(String libellesemestre) {
        this.libellesemestre = libellesemestre;
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
    public List<Enseignantmatiereclasse> getEnseignantmatiereclasseList() {
        return enseignantmatiereclasseList;
    }

    public void setEnseignantmatiereclasseList(List<Enseignantmatiereclasse> enseignantmatiereclasseList) {
        this.enseignantmatiereclasseList = enseignantmatiereclasseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsemestre != null ? idsemestre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semestre)) {
            return false;
        }
        Semestre other = (Semestre) object;
        if ((this.idsemestre == null && other.idsemestre != null) || (this.idsemestre != null && !this.idsemestre.equals(other.idsemestre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Semestre[ idsemestre=" + idsemestre + " ]";
    }
    
}
