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
@Table(name = "enseignant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enseignant.findAll", query = "SELECT e FROM Enseignant e")
    , @NamedQuery(name = "Enseignant.findByIdenseignant", query = "SELECT e FROM Enseignant e WHERE e.idenseignant = :idenseignant")
    , @NamedQuery(name = "Enseignant.findByNom", query = "SELECT e FROM Enseignant e WHERE e.nom = :nom")
    , @NamedQuery(name = "Enseignant.findByPrenom", query = "SELECT e FROM Enseignant e WHERE e.prenom = :prenom")
    , @NamedQuery(name = "Enseignant.findByRang", query = "SELECT e FROM Enseignant e WHERE e.rang = :rang")
    , @NamedQuery(name = "Enseignant.findByCivilite", query = "SELECT e FROM Enseignant e WHERE e.civilite = :civilite")
    , @NamedQuery(name = "Enseignant.findByDiplome", query = "SELECT e FROM Enseignant e WHERE e.diplome = :diplome")
    , @NamedQuery(name = "Enseignant.findByEtat", query = "SELECT e FROM Enseignant e WHERE e.etat = :etat")
    , @NamedQuery(name = "Enseignant.findByUsrcreate", query = "SELECT e FROM Enseignant e WHERE e.usrcreate = :usrcreate")
    , @NamedQuery(name = "Enseignant.findByUserlastupdate", query = "SELECT e FROM Enseignant e WHERE e.userlastupdate = :userlastupdate")
    , @NamedQuery(name = "Enseignant.findByUserdelete", query = "SELECT e FROM Enseignant e WHERE e.userdelete = :userdelete")})
public class Enseignant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idenseignant")
    private Integer idenseignant;
    @Size(max = 50)
    @Column(name = "nom")
    private String nom;
    @Size(max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 50)
    @Column(name = "rang")
    private String rang;
    @Size(max = 50)
    @Column(name = "civilite")
    private String civilite;
    @Size(max = 50)
    @Column(name = "diplome")
    private String diplome;
    @Size(max = 50)
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
    @OneToMany(mappedBy = "idenseignant")
    private List<Enseignantmatiereclasse> enseignantmatiereclasseList;

    public Enseignant() {
    }

    public Enseignant(Integer idenseignant) {
        this.idenseignant = idenseignant;
    }

    public Integer getIdenseignant() {
        return idenseignant;
    }

    public void setIdenseignant(Integer idenseignant) {
        this.idenseignant = idenseignant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
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
    public List<Enseignantmatiereclasse> getEnseignantmatiereclasseList() {
        return enseignantmatiereclasseList;
    }

    public void setEnseignantmatiereclasseList(List<Enseignantmatiereclasse> enseignantmatiereclasseList) {
        this.enseignantmatiereclasseList = enseignantmatiereclasseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idenseignant != null ? idenseignant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enseignant)) {
            return false;
        }
        Enseignant other = (Enseignant) object;
        if ((this.idenseignant == null && other.idenseignant != null) || (this.idenseignant != null && !this.idenseignant.equals(other.idenseignant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.university.entities.Enseignant[ idenseignant=" + idenseignant + " ]";
    }
    
}
