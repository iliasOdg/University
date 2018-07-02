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
@Table(name = "enseignantmatiereclasse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enseignantmatiereclasse.findAll", query = "SELECT e FROM Enseignantmatiereclasse e")
    , @NamedQuery(name = "Enseignantmatiereclasse.findByIdenseignantmatiereclasse", query = "SELECT e FROM Enseignantmatiereclasse e WHERE e.idenseignantmatiereclasse = :idenseignantmatiereclasse")
    , @NamedQuery(name = "Enseignantmatiereclasse.findByCredit", query = "SELECT e FROM Enseignantmatiereclasse e WHERE e.credit = :credit")
    , @NamedQuery(name = "Enseignantmatiereclasse.findByAnnee", query = "SELECT e FROM Enseignantmatiereclasse e WHERE e.annee = :annee")
    , @NamedQuery(name = "Enseignantmatiereclasse.findByUsrcreate", query = "SELECT e FROM Enseignantmatiereclasse e WHERE e.usrcreate = :usrcreate")
    , @NamedQuery(name = "Enseignantmatiereclasse.findByUserlastupdate", query = "SELECT e FROM Enseignantmatiereclasse e WHERE e.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Enseignantmatiereclasse.findByUserdelete", query = "SELECT e FROM Enseignantmatiereclasse e WHERE e.userdelete = :userdelete")})
public class Enseignantmatiereclasse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idenseignantmatiereclasse")
    private Integer idenseignantmatiereclasse;
    @Column(name = "credit")
    private Integer credit;
    @Size(max = 20)
    @Column(name = "annee")
    private String annee;
    @Size(max = 50)
    @Column(name = "usrcreate")
    private String usrcreate;
    @Size(max = 50)
    @Column(name = "userlastupdate")
    private String userlastupdate;
    @Size(max = 50)
    @Column(name = "userdelete")
    private String userdelete;
    @JoinColumn(name = "idclasse", referencedColumnName = "idclasse")
    @ManyToOne
    private Classe idclasse;
    @JoinColumn(name = "idenseignant", referencedColumnName = "idenseignant")
    @ManyToOne
    private Enseignant idenseignant;
    @JoinColumn(name = "idmatiere", referencedColumnName = "idmatiere")
    @ManyToOne
    private Matiere idmatiere;
    @JoinColumn(name = "idsemestre", referencedColumnName = "idsemestre")
    @ManyToOne
    private Semestre idsemestre;
    @JoinColumn(name = "idue", referencedColumnName = "idue")
    @ManyToOne
    private Uniteenseignement idue;

    public Enseignantmatiereclasse() {
    }

    public Enseignantmatiereclasse(Integer idenseignantmatiereclasse) {
        this.idenseignantmatiereclasse = idenseignantmatiereclasse;
    }

    public Integer getIdenseignantmatiereclasse() {
        return idenseignantmatiereclasse;
    }

    public void setIdenseignantmatiereclasse(Integer idenseignantmatiereclasse) {
        this.idenseignantmatiereclasse = idenseignantmatiereclasse;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
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

    public Classe getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(Classe idclasse) {
        this.idclasse = idclasse;
    }

    public Enseignant getIdenseignant() {
        return idenseignant;
    }

    public void setIdenseignant(Enseignant idenseignant) {
        this.idenseignant = idenseignant;
    }

    public Matiere getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(Matiere idmatiere) {
        this.idmatiere = idmatiere;
    }

    public Semestre getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(Semestre idsemestre) {
        this.idsemestre = idsemestre;
    }

    public Uniteenseignement getIdue() {
        return idue;
    }

    public void setIdue(Uniteenseignement idue) {
        this.idue = idue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenseignantmatiereclasse != null ? idenseignantmatiereclasse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enseignantmatiereclasse)) {
            return false;
        }
        Enseignantmatiereclasse other = (Enseignantmatiereclasse) object;
        if ((this.idenseignantmatiereclasse == null && other.idenseignantmatiereclasse != null) || (this.idenseignantmatiereclasse != null && !this.idenseignantmatiereclasse.equals(other.idenseignantmatiereclasse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Enseignantmatiereclasse[ idenseignantmatiereclasse=" + idenseignantmatiereclasse + " ]";
    }
    
}
